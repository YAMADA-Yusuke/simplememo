package database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DatabaseControler {

	/**
	 * �����œn����DB��������DB��Ԃ����\�b�h.
	 * 
	 * @param context
	 *            �R���e�L�X�g.
	 * @param dbName
	 *            DB��.
	 * @return Database.<br>
	 *         �����Ɏ��s�����ꍇ��null��Ԃ�.
	 */
	public SQLiteDatabase createDatabase(Context context, String dbName) {
		try {
			SQLiteDatabase db = context.openOrCreateDatabase(dbName,
					Context.MODE_PRIVATE, null);
			return db;
		} catch (SQLiteException e) {
			return null;
		}
	}

	/**
	 * SQL�����s���郁�\�b�h.
	 * 
	 * @param db
	 *            SQL�����s����DB.
	 * @param sql
	 *            ���s����SQL.
	 * @throws SQLException.
	 */
	public void execSQL(SQLiteDatabase db, String sql) throws SQLException {
		try {
			db.execSQL(sql);
		} catch (SQLException e) {
			throw e;
		}
	}
}
