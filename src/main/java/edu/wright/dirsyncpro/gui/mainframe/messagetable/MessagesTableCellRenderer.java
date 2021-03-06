/*
 * MessagesTableCellRenderer.java
 *
 * Copyright (C) 2010-2011 O. Givi (info@dirsyncpro.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.wright.dirsyncpro.gui.mainframe.messagetable;

import edu.wright.dirsyncpro.DirSyncPro;
import edu.wright.dirsyncpro.message.Message;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;

public class MessagesTableCellRenderer implements TableCellRenderer {

    protected JLabel cell;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (row >= DirSyncPro.getSync().getLog().getMessages().viewSize() || row < 0) {
            return null;
        }

        Message mes = DirSyncPro.getSync().getLog().getMessages().getFilteredView(row);

        cell = new JLabel();
        cell.setText(String.valueOf(value));

        //icon
        if (column == 1) {
            cell.setIcon(mes.getIcon());
        }

        //background color
        cell.setOpaque(true);
        cell.setBackground(mes.getIconKey().getColor());
        return cell;
    }
}
