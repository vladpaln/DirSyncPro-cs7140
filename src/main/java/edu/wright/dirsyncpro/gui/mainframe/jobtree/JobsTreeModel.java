/*
 * JobsTreeModel.java
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
package edu.wright.dirsyncpro.gui.mainframe.jobtree;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class JobsTreeModel extends DefaultTreeModel {

    private JobTree jobTree;

    public JobsTreeModel(JobTree jt) {
        super(jt);
        jobTree = jt;
    }

    // the root of the tree
    @Override
    public Object getRoot() {
        return jobTree;
    }

    // number of a node's childeren
    @Override
    public int getChildCount(Object parent) {
        return ((JobTree) parent).getChildCount();
    }

    // child's position in its parent node
    @Override
    public int getIndexOfChild(Object parent, Object child) {
        for (int i = 0; i < getChildCount(parent); i++) {
            if (getChild(parent, i).equals(child)) {
                return i;
            }
        }
        return -1;
    }

    // get the indexth child of the parent
    @Override
    public Object getChild(Object nodeObject, int index) {
        return ((JobTree) nodeObject).getChildAt(index);
    }

    // is it leaf?
    @Override
    public boolean isLeaf(Object node) {
        return (((JobTree) node).isLeaf());
    }

    // value changed
    @Override
    public void valueForPathChanged(TreePath path, Object newvalue) {
    }

    public void reload(JobTree jt) {
        jobTree = jt;
        int n = getChildCount(jobTree);
        int[] childIdx = new int[n];
        Object[] children = new Object[n];

        for (int i = 0; i < n; i++) {
            childIdx[i] = i;
            children[i] = getChild(jobTree, i);
        }

        fireTreeStructureChanged(this, new Object[]{jobTree}, childIdx, children);
    }

}
