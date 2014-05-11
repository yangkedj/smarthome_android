package com.robotizelife.smarthome.data.cache;

import com.robotizelife.smarthome.data.model.Device;
import com.xengine.android.data.cache.XBaseAdapterDataSource;
import com.xengine.android.data.cache.XBaseAdapterIdDataSource;

/**
 * Created by 俊 on 14-5-10.
 */
public class DeviceDataSource extends XBaseAdapterIdDataSource<Device> {
    @Override
    public String getSourceName() {
        return SourceName.DEVICE_SOURCE;
    }

    @Override
    public String getId(Device item) {
        return item.getId();
    }
}
