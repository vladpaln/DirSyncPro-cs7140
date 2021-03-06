package edu.wright.dirsyncpro.message;

import edu.wright.dirsyncpro.Const.IconKey;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Represents a queue of Messages.
 *
 * @author O. Givi (info@dirsyncpro.org)
 */
public class MessageQ {

    private ArrayList<Message> messagesQ;
    private ArrayList<Message> messagesQViewFiltered;
    private HashMap<IconKey, Boolean> viewFilterMode;
    private boolean viewFiltered;

    public MessageQ() {
        messagesQ = new ArrayList<>();
        initMessageQViewFilter();
    }

    /**
     * initializes the viewFilterMode to defaults
     */
    public void initMessageQViewFilter() {
        viewFilterMode = new HashMap<>();
        viewFilterMode.put(IconKey.Info, true);
        viewFilterMode.put(IconKey.Warning, true);
        viewFilterMode.put(IconKey.Error, true);
        viewFilterMode.put(IconKey.File, true);
        viewFilter();
    }

    public boolean add(Message m) {
        return messagesQ.add(m);
    }

    public int viewSize() {
        if (viewFiltered) {
            return messagesQViewFiltered.size();
        } else {
            return messagesQ.size();
        }
    }

    public Message getFilteredView(int i) {
        if (viewFiltered) {
            return messagesQViewFiltered.get(i);
        } else {
            return messagesQ.get(i);
        }
    }

    public void viewFilter() {
        if (getMessagesQViewFilterMode(IconKey.Info)
                && getMessagesQViewFilterMode(IconKey.Warning)
                && getMessagesQViewFilterMode(IconKey.Error)
                && getMessagesQViewFilterMode(IconKey.File)) {
            viewFiltered = false;
        } else {
            viewFiltered = true;
            messagesQViewFiltered = new ArrayList<>();
            for (Message m : messagesQ) {
                if (viewFilterMode.get(m.getIconKey().mapForMessageQ())) {
                    messagesQViewFiltered.add(m);
                }
            }
        }
    }

    /**
     * @param ik the IconKey
     *
     * @return boolean if the view filter for ik is set
     */
    public boolean getMessagesQViewFilterMode(IconKey ik) {
        return viewFilterMode.get(ik);
    }

    /**
     * @param ik the IconKey to set the value for
     * @param b boolean value to set
     */
    public void setMessagesQViewFilterMode(IconKey ik, boolean b) {
        viewFilterMode.put(ik, b);
    }

}
