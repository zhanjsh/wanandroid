package com.dong.wanandroid.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dong.wanandroid.data.user.IntegerConverter;
import java.util.List;

import com.dong.wanandroid.data.user.UserModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_MODEL".
*/
public class UserModelDao extends AbstractDao<UserModel, Void> {

    public static final String TABLENAME = "USER_MODEL";

    /**
     * Properties of entity UserModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Email = new Property(0, String.class, "email", false, "EMAIL");
        public final static Property Icon = new Property(1, String.class, "icon", false, "ICON");
        public final static Property Id = new Property(2, int.class, "id", false, "ID");
        public final static Property Password = new Property(3, String.class, "password", false, "PASSWORD");
        public final static Property Type = new Property(4, int.class, "type", false, "TYPE");
        public final static Property Username = new Property(5, String.class, "username", false, "USERNAME");
        public final static Property CollectIds = new Property(6, String.class, "collectIds", false, "COLLECT_IDS");
    }

    private final IntegerConverter collectIdsConverter = new IntegerConverter();

    public UserModelDao(DaoConfig config) {
        super(config);
    }
    
    public UserModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_MODEL\" (" + //
                "\"EMAIL\" TEXT," + // 0: email
                "\"ICON\" TEXT," + // 1: icon
                "\"ID\" INTEGER NOT NULL ," + // 2: id
                "\"PASSWORD\" TEXT," + // 3: password
                "\"TYPE\" INTEGER NOT NULL ," + // 4: type
                "\"USERNAME\" TEXT," + // 5: username
                "\"COLLECT_IDS\" TEXT);"); // 6: collectIds
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(1, email);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(2, icon);
        }
        stmt.bindLong(3, entity.getId());
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
        stmt.bindLong(5, entity.getType());
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(6, username);
        }
 
        List collectIds = entity.getCollectIds();
        if (collectIds != null) {
            stmt.bindString(7, collectIdsConverter.convertToDatabaseValue(collectIds));
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(1, email);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(2, icon);
        }
        stmt.bindLong(3, entity.getId());
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
        stmt.bindLong(5, entity.getType());
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(6, username);
        }
 
        List collectIds = entity.getCollectIds();
        if (collectIds != null) {
            stmt.bindString(7, collectIdsConverter.convertToDatabaseValue(collectIds));
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public UserModel readEntity(Cursor cursor, int offset) {
        UserModel entity = new UserModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // email
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // icon
            cursor.getInt(offset + 2), // id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // password
            cursor.getInt(offset + 4), // type
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // username
            cursor.isNull(offset + 6) ? null : collectIdsConverter.convertToEntityProperty(cursor.getString(offset + 6)) // collectIds
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserModel entity, int offset) {
        entity.setEmail(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setIcon(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setId(cursor.getInt(offset + 2));
        entity.setPassword(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.getInt(offset + 4));
        entity.setUsername(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCollectIds(cursor.isNull(offset + 6) ? null : collectIdsConverter.convertToEntityProperty(cursor.getString(offset + 6)));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(UserModel entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(UserModel entity) {
        return null;
    }

    @Override
    public boolean hasKey(UserModel entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
