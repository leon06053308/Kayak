/**
 * 	This file is part of Kayak.
 *
 *	Kayak is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU Lesser General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	Kayak is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU Lesser General Public License
 *	along with Kayak.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.github.kayak.logging.snapshots;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;

/**
 *
 * @author Jan-Niklas Meier <dschanoeh@googlemail.com>
 */
@ActionRegistration(displayName = "Enable snapshots", iconBase = "org/freedesktop/tango/16x16/devices/camera-photo.png", iconInMenu = true, surviveFocusChange = true)
@ActionID(category = "Log files", id = "com.github.kayak.logging.snapshots.EnableSnapshotsAction")
@ActionReferences(value = {
    @ActionReference(path = "Menu/Log files", position = 30)})
public class EnableSnapshotsAction extends AbstractAction {

    private static final Logger logger = Logger.getLogger(CreateSnapshotAction.class.getCanonicalName());
    private static SnapshotBuffer buffer = new SnapshotBuffer();

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.log(Level.INFO, "Enabling snapshots...");
        SnapshotManager.startBuffering();
    }
}
