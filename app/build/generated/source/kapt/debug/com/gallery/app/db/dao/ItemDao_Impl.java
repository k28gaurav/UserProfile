package com.gallery.app.db.dao;

import android.arch.paging.DataSource;
import android.arch.paging.DataSource.Factory;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EmptyResultSetException;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.paging.LimitOffsetDataSource;
import android.database.Cursor;
import com.gallery.app.data.db.entities.Item;
import io.reactivex.Single;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings("unchecked")
public class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfItem;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItem = new EntityInsertionAdapter<Item>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `items`(`id`,`album_id`,`title`,`url`,`thumbnail_url`,`price`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Item value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getAlbumId());
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        if (value.getThumbnailUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getThumbnailUrl());
        }
        if (value.getPrice() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getPrice());
        }
      }
    };
  }

  @Override
  public List<Long> insertItems(List<Item> items) {
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfItem.insertAndReturnIdsList(items);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public DataSource.Factory<Integer, Item> getItems() {
    final String _sql = "SELECT * FROM items";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Item>() {
      @Override
      public LimitOffsetDataSource<Item> create() {
        return new LimitOffsetDataSource<Item>(__db, _statement, false , "items") {
          @Override
          protected List<Item> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfAlbumId = cursor.getColumnIndexOrThrow("album_id");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfUrl = cursor.getColumnIndexOrThrow("url");
            final int _cursorIndexOfThumbnailUrl = cursor.getColumnIndexOrThrow("thumbnail_url");
            final int _cursorIndexOfPrice = cursor.getColumnIndexOrThrow("price");
            final List<Item> _res = new ArrayList<Item>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Item _item;
              final int _tmpId;
              _tmpId = cursor.getInt(_cursorIndexOfId);
              final int _tmpAlbumId;
              _tmpAlbumId = cursor.getInt(_cursorIndexOfAlbumId);
              final String _tmpTitle;
              _tmpTitle = cursor.getString(_cursorIndexOfTitle);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              final String _tmpThumbnailUrl;
              _tmpThumbnailUrl = cursor.getString(_cursorIndexOfThumbnailUrl);
              final Double _tmpPrice;
              if (cursor.isNull(_cursorIndexOfPrice)) {
                _tmpPrice = null;
              } else {
                _tmpPrice = cursor.getDouble(_cursorIndexOfPrice);
              }
              _item = new Item(_tmpId,_tmpAlbumId,_tmpTitle,_tmpUrl,_tmpThumbnailUrl,_tmpPrice);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public Single<Integer> getItemsCount() {
    final String _sql = "SELECT COUNT(*) FROM items";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Single.fromCallable(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = __db.query(_statement);
        try {
          final java.lang.Integer _result;
          if(_cursor.moveToFirst()) {
            final java.lang.Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
