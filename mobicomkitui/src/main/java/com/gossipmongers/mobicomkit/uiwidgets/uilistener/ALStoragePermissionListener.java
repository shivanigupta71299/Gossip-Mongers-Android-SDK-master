package com.gossipmongers.mobicomkit.uiwidgets.uilistener;

/**
 * Created by ashish on 04/06/18.
 */

public interface ALStoragePermissionListener {
    boolean isPermissionGranted();

    void checkPermission(ALStoragePermission storagePermission);
}
