package com.dong.wanandroid.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dong.wanandroid.data.home.HomeArticleModel;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HOME_ARTICLE_MODEL".
*/
public class HomeArticleModelDao extends AbstractDao<HomeArticleModel, Void> {

    public static final String TABLENAME = "HOME_ARTICLE_MODEL";

    /**
     * Properties of entity HomeArticleModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ApkLink = new Property(0, String.class, "apkLink", false, "APK_LINK");
        public final static Property Author = new Property(1, String.class, "author", false, "AUTHOR");
        public final static Property ChapterId = new Property(2, int.class, "chapterId", false, "CHAPTER_ID");
        public final static Property ChapterName = new Property(3, String.class, "chapterName", false, "CHAPTER_NAME");
        public final static Property Collect = new Property(4, boolean.class, "collect", false, "COLLECT");
        public final static Property CourseId = new Property(5, int.class, "courseId", false, "COURSE_ID");
        public final static Property Desc = new Property(6, String.class, "desc", false, "DESC");
        public final static Property EnvelopePic = new Property(7, String.class, "envelopePic", false, "ENVELOPE_PIC");
        public final static Property Id = new Property(8, int.class, "id", false, "ID");
        public final static Property Link = new Property(9, String.class, "link", false, "LINK");
        public final static Property NiceDate = new Property(10, String.class, "niceDate", false, "NICE_DATE");
        public final static Property Origin = new Property(11, String.class, "origin", false, "ORIGIN");
        public final static Property ProjectLink = new Property(12, String.class, "projectLink", false, "PROJECT_LINK");
        public final static Property PublishTime = new Property(13, long.class, "publishTime", false, "PUBLISH_TIME");
        public final static Property Title = new Property(14, String.class, "title", false, "TITLE");
        public final static Property Visible = new Property(15, int.class, "visible", false, "VISIBLE");
        public final static Property Zan = new Property(16, int.class, "zan", false, "ZAN");
    }


    public HomeArticleModelDao(DaoConfig config) {
        super(config);
    }
    
    public HomeArticleModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HOME_ARTICLE_MODEL\" (" + //
                "\"APK_LINK\" TEXT," + // 0: apkLink
                "\"AUTHOR\" TEXT," + // 1: author
                "\"CHAPTER_ID\" INTEGER NOT NULL ," + // 2: chapterId
                "\"CHAPTER_NAME\" TEXT," + // 3: chapterName
                "\"COLLECT\" INTEGER NOT NULL ," + // 4: collect
                "\"COURSE_ID\" INTEGER NOT NULL ," + // 5: courseId
                "\"DESC\" TEXT," + // 6: desc
                "\"ENVELOPE_PIC\" TEXT," + // 7: envelopePic
                "\"ID\" INTEGER NOT NULL ," + // 8: id
                "\"LINK\" TEXT," + // 9: link
                "\"NICE_DATE\" TEXT," + // 10: niceDate
                "\"ORIGIN\" TEXT," + // 11: origin
                "\"PROJECT_LINK\" TEXT," + // 12: projectLink
                "\"PUBLISH_TIME\" INTEGER NOT NULL ," + // 13: publishTime
                "\"TITLE\" TEXT," + // 14: title
                "\"VISIBLE\" INTEGER NOT NULL ," + // 15: visible
                "\"ZAN\" INTEGER NOT NULL );"); // 16: zan
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HOME_ARTICLE_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HomeArticleModel entity) {
        stmt.clearBindings();
 
        String apkLink = entity.getApkLink();
        if (apkLink != null) {
            stmt.bindString(1, apkLink);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(2, author);
        }
        stmt.bindLong(3, entity.getChapterId());
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(4, chapterName);
        }
        stmt.bindLong(5, entity.getCollect() ? 1L: 0L);
        stmt.bindLong(6, entity.getCourseId());
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(7, desc);
        }
 
        String envelopePic = entity.getEnvelopePic();
        if (envelopePic != null) {
            stmt.bindString(8, envelopePic);
        }
        stmt.bindLong(9, entity.getId());
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(10, link);
        }
 
        String niceDate = entity.getNiceDate();
        if (niceDate != null) {
            stmt.bindString(11, niceDate);
        }
 
        String origin = entity.getOrigin();
        if (origin != null) {
            stmt.bindString(12, origin);
        }
 
        String projectLink = entity.getProjectLink();
        if (projectLink != null) {
            stmt.bindString(13, projectLink);
        }
        stmt.bindLong(14, entity.getPublishTime());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(15, title);
        }
        stmt.bindLong(16, entity.getVisible());
        stmt.bindLong(17, entity.getZan());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HomeArticleModel entity) {
        stmt.clearBindings();
 
        String apkLink = entity.getApkLink();
        if (apkLink != null) {
            stmt.bindString(1, apkLink);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(2, author);
        }
        stmt.bindLong(3, entity.getChapterId());
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(4, chapterName);
        }
        stmt.bindLong(5, entity.getCollect() ? 1L: 0L);
        stmt.bindLong(6, entity.getCourseId());
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(7, desc);
        }
 
        String envelopePic = entity.getEnvelopePic();
        if (envelopePic != null) {
            stmt.bindString(8, envelopePic);
        }
        stmt.bindLong(9, entity.getId());
 
        String link = entity.getLink();
        if (link != null) {
            stmt.bindString(10, link);
        }
 
        String niceDate = entity.getNiceDate();
        if (niceDate != null) {
            stmt.bindString(11, niceDate);
        }
 
        String origin = entity.getOrigin();
        if (origin != null) {
            stmt.bindString(12, origin);
        }
 
        String projectLink = entity.getProjectLink();
        if (projectLink != null) {
            stmt.bindString(13, projectLink);
        }
        stmt.bindLong(14, entity.getPublishTime());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(15, title);
        }
        stmt.bindLong(16, entity.getVisible());
        stmt.bindLong(17, entity.getZan());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public HomeArticleModel readEntity(Cursor cursor, int offset) {
        HomeArticleModel entity = new HomeArticleModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // apkLink
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // author
            cursor.getInt(offset + 2), // chapterId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // chapterName
            cursor.getShort(offset + 4) != 0, // collect
            cursor.getInt(offset + 5), // courseId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // desc
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // envelopePic
            cursor.getInt(offset + 8), // id
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // link
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // niceDate
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // origin
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // projectLink
            cursor.getLong(offset + 13), // publishTime
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // title
            cursor.getInt(offset + 15), // visible
            cursor.getInt(offset + 16) // zan
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HomeArticleModel entity, int offset) {
        entity.setApkLink(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setAuthor(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChapterId(cursor.getInt(offset + 2));
        entity.setChapterName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCollect(cursor.getShort(offset + 4) != 0);
        entity.setCourseId(cursor.getInt(offset + 5));
        entity.setDesc(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setEnvelopePic(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setId(cursor.getInt(offset + 8));
        entity.setLink(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setNiceDate(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setOrigin(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setProjectLink(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setPublishTime(cursor.getLong(offset + 13));
        entity.setTitle(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setVisible(cursor.getInt(offset + 15));
        entity.setZan(cursor.getInt(offset + 16));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(HomeArticleModel entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(HomeArticleModel entity) {
        return null;
    }

    @Override
    public boolean hasKey(HomeArticleModel entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
