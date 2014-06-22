package database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DatabaseControler {

	/**
	 * 引数で渡したDB名を持つDBを返すメソッド.
	 * 
	 * @param context
	 *            コンテキスト.
	 * @param dbName
	 *            DB名.
	 * @return Database.<br>
	 *         処理に失敗した場合はnullを返す.
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
	 * SQLを実行するメソッド.
	 * 
	 * @param db
	 *            SQLを実行するDB.
	 * @param sql
	 *            実行するSQL.
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
