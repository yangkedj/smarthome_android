package com.robotizelife.smarthome.data.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.robotizelife.smarthome.data.model.Device;
import com.xengine.android.data.db.XBaseDBTable;
import com.xengine.android.data.db.XSQLiteConstraint;
import com.xengine.android.data.db.XSQLiteDataType;

/**
 * Created by 俊 on 14-5-10.
 */
public class DeviceTable extends XBaseDBTable<Device> {

    private static final String COL_ID = "device_id";
    private static final String COL_NAME = "device_name";

    @Override
    public void initiateColumns() {
        addColumn(COL_ID, XSQLiteDataType.TEXT, XSQLiteConstraint.UNIQUE);
        addColumn(COL_NAME, XSQLiteDataType.TEXT, null);
    }

    @Override
    public String getName() {
        return "device_table";
    }

    @Override
    public ContentValues getContentValues(Device instance) {
        ContentValues values = new ContentValues();
        values.put(COL_ID, instance.getId());
        values.put(COL_NAME, instance.getName());
        return values;
    }

    @Override
    public Device getFilledInstance(Cursor cursor) {
        Device instance = new Device();
        instance.setId(cursor.getString(cursor.getColumnIndex(COL_ID)));
        instance.setName(cursor.getString(cursor.getColumnIndex(COL_NAME)));
        return instance;
    }
}
