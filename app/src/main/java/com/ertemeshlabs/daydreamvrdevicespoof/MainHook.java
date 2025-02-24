/*
 * WearableSpoof
 * Copyright (C) 2023 Simon1511
 * CaimanSpoof
 * Copyright (C) 2024 RisenID
 * DaydreamVR Device Spoof
 * Copyright (C) 2025 ErteMesh Labs
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

package com.ertemeshlabs.daydreamvrdevicespoof;

import android.os.Build;

// Xposed Library
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {        
        XposedBridge.log("DaydreamVRDeviceSpoof_Log: Hooking into: " + lpparam.packageName);

        // ro.product.manufacturer
        XposedHelpers.setStaticObjectField(Build.class, "MANUFACTURER", "");

        // ro.product.brand
        XposedHelpers.setStaticObjectField(Build.class, "BRAND", "");

        // ro.product.device
        XposedHelpers.setStaticObjectField(Build.class, "DEVICE", "");

        // ro.build.tags
        XposedHelpers.setStaticObjectField(Build.class, "TAGS", "");

        // ro.build.type
        XposedHelpers.setStaticObjectField(Build.class, "TYPE", "");

        // ro.product.product
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT", "");

        // ro.product.name
        XposedHelpers.setStaticObjectField(Build.class, "name", "");

        // ro.product.model
        XposedHelpers.setStaticObjectField(Build.class, "PRODUCT.MODEL", "");

        // ro.build.id
        XposedHelpers.setStaticObjectField(Build.class, "ID", "");

		// ro.product.flavor
        XposedHelpers.setStaticObjectField(Build.class, "FLAVOUR", "");
		
        // ro.build.fingerprint
        XposedHelpers.setStaticObjectField(Build.class, "FINGERPRINT", "");
    }
}