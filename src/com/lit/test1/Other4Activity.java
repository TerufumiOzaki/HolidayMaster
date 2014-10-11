package com.lit.test1;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Other4Activity extends Activity {

	int a, b, c, d, f;
	Random r = new Random();
	int random1 = r.nextInt(1);
	int random2 = r.nextInt(2);
	int random3 = r.nextInt(3);
	int random6 = r.nextInt(6);
	int random7 = r.nextInt(7);
	int random9 = r.nextInt(9);
	int random10 = r.nextInt(10);
	int random14 = r.nextInt(14);
	int random23 = r.nextInt(23);
	int random26 = r.nextInt(26);
	int random45 = r.nextInt(45);
	int random57 = r.nextInt(57);

	private SharedPreferences mSharedPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other4);

		setTitle("HolidayMaster");

		TextView text1 = (TextView) findViewById(R.id.text1);
		TextView text2 = (TextView) findViewById(R.id.text2);
		TextView text3 = (TextView) findViewById(R.id.text3);
		text1.setText("大阪で遊べる検索結果です。");

		mSharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(this);

		ImageView image1 = (ImageView) findViewById(R.id.image1);

		c = mSharedPreferences.getInt("c", 0);
		d = mSharedPreferences.getInt("d", 0);
		f = mSharedPreferences.getInt("f", 0);

		switch (f) {
		case 0:
			switch (c) {
			case 0:
				switch (random57) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("アマーク　ド　パラディ (カフェ)");
					text3.setText("大阪市中央区南船場4-12-21");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クレープリー　アルション (カフェ)");
					text3.setText("大阪市中央区難波1-4-18");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Planet3rd (カフェ)");
					text3.setText("大阪市中央区西心斎橋1-5-24 ハートンホテル心斎橋1");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ベリーファンシー (カフェ)");
					text3.setText("大阪市中央区心斎橋筋1-5-24 蔵人心斎橋ビル 2F 3F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("北極星 (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-7-27");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("COCOASHOP　AKAI TORI (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-7-25 金子ビル2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("リバーカフェ (カフェ)");
					text3.setText("大阪市浪速区湊町1-3-1 湊町リバープレイス3F");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("太陽の塔 (カフェ)");
					text3.setText("大阪市中央区難波5-1-60");
					break;
				case 9:
					image1.setImageResource(R.drawable.osaka_anaba8_america);
					text2.setText("アメリカ村");
					text3.setText("大阪市中央区西心斎橋1-9-16");
					break;
				case 10:
					image1.setImageResource(R.drawable.osaka_anaba7_hepfive);
					text2.setText("HEP FIVE");
					text3.setText("大阪市北区角田町5-15");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市浪速区湊町1-3-1 湊町リバープレイス 3F");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARABIYA (カフェ)");
					text3.setText("大阪市中央区難波1-6-7");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TABLES CAFE (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-5-15 クロスホテル大阪 1F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("和カフェyusoshi chano-ma なんばマルイ店 (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 7F");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STANDARD BOOKSTORE (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-2-12クリスタグランドビル1FBF");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("BUTTERFLY (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 2F");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("野菜直売 Green Cafe (カフェ)");
					text3.setText("大阪市浪速区湊町1-4-1 OCAT 1F");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe The Plant Room (カフェ)");
					text3.setText("大阪市中央区難波3-7-11");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MINGUS (カフェ)");
					text3.setText("大阪市中央区難波5-1-60 なんばCITY 本館 B2F");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ANTICO CAFFE ALAVIS (カフェ)");
					text3.setText("大阪市浪速区難波中2-10-70 なんばパークス 2F");
					break;
				case 21:
					image1.setImageResource(R.drawable.osaka_anaba6_nambaparks);
					text2.setText("なんばパークス");
					text3.setText("大阪市浪速区難波中2-10-70");
					break;
				case 22:
					image1.setImageResource(R.drawable.osaka_anaba5_umedasky);
					text2.setText("梅田スカイビル");
					text3.setText("大阪市北区大淀中１−１−88 梅田スカイビル");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LOBBY CAFE FASCINO (カフェ)");
					text3.setText("大阪市中央区難波5-1-18 なんばダイニングメゾン 7F");
					break;
				case 24:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Anna Colors COFFEE (カフェ)");
					text3.setText("大阪市浪速区日本橋3-4-10 ホテルヒラリーズ 1F");
					break;
				case 25:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafe de la Paix (カフェ)");
					text3.setText("大阪市中央区難波4-2-1 難波御堂筋ビルディング2階");
					break;
				case 26:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("UMIYA CAFE westpoint (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-16-14 宝泉ビル 1F");
					break;
				case 27:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NOON+CAFE (カフェ)");
					text3.setText("大阪市北区中崎西3-3-8");
					break;
				case 28:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Factory Cafe (カフェ)");
					text3.setText("大阪市北区芝田1-7-2 阪急かっぱ横丁");
					break;
				case 29:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("WIRED CAFE 梅田NU chayamachi店 (カフェ)");
					text3.setText("大阪市北区茶屋町10-12 NU Chayamachi 2F");
					break;
				case 30:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("HANDS CAFE (カフェ)");
					text3.setText("大阪市北区梅田3-1-1 大丸梅田店 10F");
					break;
				case 31:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブラザーズカフェ 梅田オーパ店 (カフェ)");
					text3.setText("大阪市北区茶屋町1-27");
					break;
				case 32:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("The Grand Cafe (カフェ)");
					text3.setText("大阪市北区梅田2-2-2 ヒルトンプラザウエスト 6F");
					break;
				case 33:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("スーホルム カフェ+ダイニング (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 北館 1F");
					break;
				case 34:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市北区芝田1-1-3 阪急三番街 B2F");
					break;
				case 35:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("雪ノ下工房 (カフェ)");
					text3.setText("大阪市北区太融寺4-10");
					break;
				case 36:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Marble (カフェ)");
					text3.setText("大阪市北区中崎西3丁目3-43-4 3F");
					break;
				case 37:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ノードカフェ (カフェ)");
					text3.setText("大阪市北区梅田1-1-3 大阪駅前第3ビル B2F");
					break;
				case 38:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("colors (カフェ)");
					text3.setText("大阪市北区中崎西2-4-20 チェルシーマーケット");
					break;
				case 39:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PARTAGE (カフェ)");
					text3.setText("大阪市北区茶屋町5-7 1F");
					break;
				case 40:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafeゆう 梅田店 (カフェ)");
					text3.setText("大阪市北区芝田1-10-3");
					break;
				case 41:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Hug Cafe (カフェ)");
					text3.setText("大阪市北区中崎西2-4-26 高架下60号");
					break;
				case 42:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("美山cafe 梅三小路店 (カフェ)");
					text3.setText("大阪市北区梅田3-2-410");
					break;
				case 43:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("agmo on (カフェ)");
					text3.setText("大阪市北区中崎西2-3-14 興栄ビル 1F");
					break;
				case 44:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("トリトンカフェ 梅田店 (カフェ)");
					text3.setText("大阪市北区梅田1-13-13 阪神百貨店梅田本店 3F");
					break;
				case 45:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("J'adore Chayamachi (カフェ)");
					text3.setText("大阪市北区鶴野町4-11 朝日プラザ 1F");
					break;
				case 46:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DOWNSTAIRS COFFEE (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 ナレッジキャピタル 1F");
					break;
				case 47:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("SOLVIVA (カフェ)");
					text3.setText("大阪市北区茶屋町19-1 梅田芸術劇場1F");
					break;
				case 48:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Monsoon Cafe (カフェ)");
					text3.setText("大阪市北区茶屋町15-22 アーバンテラス茶屋町A棟 4F");
					break;
				case 49:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ツェープラス (カフェ)");
					text3.setText("大阪市北区茶屋町8-26 NU茶屋町プラス3F");
					break;
				case 50:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("国立国際美術館");
					text3.setText("大阪市北区中之島4-2-55");
					break;
				case 51:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("miss evans (カフェ)");
					text3.setText("大阪市阿倍野区文の里4-3-5");
					break;
				case 52:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DJANGO (カフェ)");
					text3.setText("大阪市阿倍野区王子町2-4-11 第2ナカビル 1F");
					break;
				case 53:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("j.s. pancake cafe (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-48 天王寺ミオ プラザ館 2F");
					break;
				case 54:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("メゾンカイザー あべのハルカス近鉄本店 タワー館 (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋1-1-43 あべのハルカス近鉄本店 タワー館 1F");
					break;
				case 55:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Oval (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋2-4-45 2F");
					break;
				case 56:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("aureole d’ange (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-39 天王寺ミオ 2F");
					break;
				case 57:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("あべの Q's MALL");
					text3.setText("大阪市阿倍野区阿倍野筋1-6-1");
					break;
				}
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 1:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random3) {
				case 1:
					image1.setImageResource(R.drawable.osaka_anaba7_hepfive);
					text2.setText("HEP FIVE");
					text3.setText("大阪市北区角田町5-15");
					break;
				case 2:
					image1.setImageResource(R.drawable.osaka_anaba6_nambaparks);
					text2.setText("なんばパークス");
					text3.setText("大阪市浪速区難波中2-10-70");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("あべの Q's MALL");
					text3.setText("大阪市阿倍野区阿倍野筋1-6-1");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 2:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random45) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("アマーク　ド　パラディ (カフェ)");
					text3.setText("大阪市中央区南船場4-12-21");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クレープリー　アルション (カフェ)");
					text3.setText("大阪市中央区難波1-4-18");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Planet3rd (カフェ)");
					text3.setText("大阪市中央区西心斎橋1-5-24 ハートンホテル心斎橋1");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ベリーファンシー (カフェ)");
					text3.setText("大阪市中央区心斎橋筋1-5-24 蔵人心斎橋ビル 2F 3F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("北極星 (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-7-27");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("COCOASHOP　AKAI TORI (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-7-25 金子ビル2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("リバーカフェ (カフェ)");
					text3.setText("大阪市浪速区湊町1-3-1 湊町リバープレイス3F");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("太陽の塔 (カフェ)");
					text3.setText("大阪市中央区難波5-1-60");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市浪速区湊町1-3-1 湊町リバープレイス 3F");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARABIYA (カフェ)");
					text3.setText("大阪市中央区難波1-6-7");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TABLES CAFE (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-5-15 クロスホテル大阪 1F");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("和カフェyusoshi chano-ma なんばマルイ店 (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 7F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STANDARD BOOKSTORE (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-2-12クリスタグランドビル1FBF");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("BUTTERFLY (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 2F");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("野菜直売 Green Cafe (カフェ)");
					text3.setText("大阪市浪速区湊町1-4-1 OCAT 1F");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe The Plant Room (カフェ)");
					text3.setText("大阪市中央区難波3-7-11");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MINGUS (カフェ)");
					text3.setText("大阪市中央区難波5-1-60 なんばCITY 本館 B2F");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ANTICO CAFFE ALAVIS (カフェ)");
					text3.setText("大阪市浪速区難波中2-10-70 なんばパークス 2F");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LOBBY CAFE FASCINO (カフェ)");
					text3.setText("大阪市中央区難波5-1-18 なんばダイニングメゾン 7F");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Anna Colors COFFEE (カフェ)");
					text3.setText("大阪市浪速区日本橋3-4-10 ホテルヒラリーズ 1F");
					break;
				case 21:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafe de la Paix (カフェ)");
					text3.setText("大阪市中央区難波4-2-1 難波御堂筋ビルディング2階");
					break;
				case 22:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("UMIYA CAFE westpoint (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-16-14 宝泉ビル 1F");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NOON+CAFE (カフェ)");
					text3.setText("大阪市北区中崎西3-3-8");
					break;
				case 24:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Factory Cafe (カフェ)");
					text3.setText("大阪市北区芝田1-7-2 阪急かっぱ横丁");
					break;
				case 25:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("WIRED CAFE 梅田NU chayamachi店 (カフェ)");
					text3.setText("大阪市北区茶屋町10-12 NU Chayamachi 2F");
					break;
				case 26:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("HANDS CAFE (カフェ)");
					text3.setText("大阪市北区梅田3-1-1 大丸梅田店 10F");
					break;
				case 27:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブラザーズカフェ 梅田オーパ店 (カフェ)");
					text3.setText("大阪市北区茶屋町1-27");
					break;
				case 28:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("The Grand Cafe (カフェ)");
					text3.setText("大阪市北区梅田2-2-2 ヒルトンプラザウエスト 6F");
					break;
				case 29:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("スーホルム カフェ+ダイニング (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 北館 1F");
					break;
				case 30:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市北区芝田1-1-3 阪急三番街 B2F");
					break;
				case 31:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("雪ノ下工房 (カフェ)");
					text3.setText("大阪市北区太融寺4-10");
					break;
				case 32:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Marble (カフェ)");
					text3.setText("大阪市北区中崎西3丁目3-43-4 3F");
					break;
				case 33:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ノードカフェ (カフェ)");
					text3.setText("大阪市北区梅田1-1-3 大阪駅前第3ビル B2F");
					break;
				case 34:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("colors (カフェ)");
					text3.setText("大阪市北区中崎西2-4-20 チェルシーマーケット");
					break;
				case 35:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PARTAGE (カフェ)");
					text3.setText("大阪市北区茶屋町5-7 1F");
					break;
				case 36:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafeゆう 梅田店 (カフェ)");
					text3.setText("大阪市北区芝田1-10-3");
					break;
				case 37:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Hug Cafe (カフェ)");
					text3.setText("大阪市北区中崎西2-4-26 高架下60号");
					break;
				case 38:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("美山cafe 梅三小路店 (カフェ)");
					text3.setText("大阪市北区梅田3-2-410");
					break;
				case 39:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("agmo on (カフェ)");
					text3.setText("大阪市北区中崎西2-3-14 興栄ビル 1F");
					break;
				case 40:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("トリトンカフェ 梅田店 (カフェ)");
					text3.setText("大阪市北区梅田1-13-13 阪神百貨店梅田本店 3F");
					break;
				case 41:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("J'adore Chayamachi (カフェ)");
					text3.setText("大阪市北区鶴野町4-11 朝日プラザ 1F");
					break;
				case 42:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DOWNSTAIRS COFFEE (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 ナレッジキャピタル 1F");
					break;
				case 43:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("SOLVIVA (カフェ)");
					text3.setText("大阪市北区茶屋町19-1 梅田芸術劇場1F");
					break;
				case 44:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Monsoon Cafe (カフェ)");
					text3.setText("大阪市北区茶屋町15-22 アーバンテラス茶屋町A棟 4F");
					break;
				case 45:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ツェープラス (カフェ)");
					text3.setText("大阪市北区茶屋町8-26 NU茶屋町プラス3F");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 3:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("国立国際美術館");
					text3.setText("大阪市北区中之島4-2-55");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
			break;

		case 1:
			switch (c) {
			case 0:
				switch (random26) {
				case 1:
					image1.setImageResource(R.drawable.osaka_anaba7_hepfive);
					text2.setText("HEP FIVE");
					text3.setText("大阪市北区角田町5-15");
					break;
				case 2:
					image1.setImageResource(R.drawable.osaka_anaba5_umedasky);
					text2.setText("梅田スカイビル");
					text3.setText("大阪市北区大淀中１−１−88 梅田スカイビル");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NOON+CAFE (カフェ)");
					text3.setText("大阪市北区中崎西3-3-8");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Factory Cafe (カフェ)");
					text3.setText("大阪市北区芝田1-7-2 阪急かっぱ横丁");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("WIRED CAFE 梅田NU chayamachi店 (カフェ)");
					text3.setText("大阪市北区茶屋町10-12 NU Chayamachi 2F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("HANDS CAFE (カフェ)");
					text3.setText("大阪市北区梅田3-1-1 大丸梅田店 10F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブラザーズカフェ 梅田オーパ店 (カフェ)");
					text3.setText("大阪市北区茶屋町1-27");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("The Grand Cafe (カフェ)");
					text3.setText("大阪市北区梅田2-2-2 ヒルトンプラザウエスト 6F");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("スーホルム カフェ+ダイニング (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 北館 1F");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("リバーカフェ (カフェ)");
					text3.setText("大阪市北区芝田1-1-3 阪急三番街 B2F");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("太陽の塔 (カフェ)");
					text3.setText("大阪市北区太融寺4-10");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市北区中崎西3丁目3-43-4 3F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARABIYA (カフェ)");
					text3.setText("大阪市北区梅田1-1-3 大阪駅前第3ビル B2F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TABLES CAFE (カフェ)");
					text3.setText("大阪市北区中崎西2-4-20 チェルシーマーケット");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PARTAGE (カフェ)");
					text3.setText("大阪市北区茶屋町5-7 1F");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafeゆう 梅田店 (カフェ)");
					text3.setText("大阪市北区芝田1-10-3");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Hug Cafe (カフェ)");
					text3.setText("大阪市北区中崎西2-4-26 高架下60号");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("美山cafe 梅三小路店 (カフェ)");
					text3.setText("大阪市北区梅田3-2-410");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("agmo on (カフェ)");
					text3.setText("大阪市北区中崎西2-3-14 興栄ビル 1F");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("トリトンカフェ 梅田店 (カフェ)");
					text3.setText("大阪市北区梅田1-13-13 阪神百貨店梅田本店 3F");
					break;
				case 21:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("J'adore Chayamachi (カフェ)");
					text3.setText("大阪市北区鶴野町4-11 朝日プラザ 1F");
					break;
				case 22:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DOWNSTAIRS COFFEE (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 ナレッジキャピタル 1F");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("SOLVIVA (カフェ)");
					text3.setText("大阪市北区茶屋町19-1 梅田芸術劇場1F");
					break;
				case 24:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Monsoon Cafe (カフェ)");
					text3.setText("大阪市北区茶屋町15-22 アーバンテラス茶屋町A棟 4F");
					break;
				case 25:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ツェープラス (カフェ)");
					text3.setText("大阪市北区茶屋町8-26 NU茶屋町プラス3F");
					break;
				case 26:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("国立国際美術館");
					text3.setText("大阪市北区中之島4-2-55");
					break;
				}
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 1:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.osaka_anaba7_hepfive);
					text2.setText("HEP FIVE");
					text3.setText("大阪市北区角田町5-15");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 2:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random23) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NOON+CAFE (カフェ)");
					text3.setText("大阪市北区中崎西3-3-8");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Factory Cafe (カフェ)");
					text3.setText("大阪市北区芝田1-7-2 阪急かっぱ横丁");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("WIRED CAFE 梅田NU chayamachi店 (カフェ)");
					text3.setText("大阪市北区茶屋町10-12 NU Chayamachi 2F");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("HANDS CAFE (カフェ)");
					text3.setText("大阪市北区梅田3-1-1 大丸梅田店 10F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブラザーズカフェ 梅田オーパ店 (カフェ)");
					text3.setText("大阪市北区茶屋町1-27");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("The Grand Cafe (カフェ)");
					text3.setText("大阪市北区梅田2-2-2 ヒルトンプラザウエスト 6F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("スーホルム カフェ+ダイニング (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 北館 1F");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RIVER CAFE (カフェ)");
					text3.setText("大阪市北区芝田1-1-3 阪急三番街 B2F");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("雪ノ下工房 (カフェ)");
					text3.setText("大阪市北区太融寺4-10");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Marble (カフェ)");
					text3.setText("大阪市北区中崎西3丁目3-43-4 3F");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ノードカフェ (カフェ)");
					text3.setText("大阪市北区梅田1-1-3 大阪駅前第3ビル B2F");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("colors (カフェ)");
					text3.setText("大阪市北区中崎西2-4-20 チェルシーマーケット");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PARTAGE (カフェ)");
					text3.setText("大阪市北区茶屋町5-7 1F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafeゆう 梅田店 (カフェ)");
					text3.setText("大阪市北区芝田1-10-3");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Hug Cafe (カフェ)");
					text3.setText("大阪市北区中崎西2-4-26 高架下60号");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("美山cafe 梅三小路店 (カフェ)");
					text3.setText("大阪市北区梅田3-2-410");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("agmo on (カフェ)");
					text3.setText("大阪市北区中崎西2-3-14 興栄ビル 1F");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("トリトンカフェ 梅田店 (カフェ)");
					text3.setText("大阪市北区梅田1-13-13 阪神百貨店梅田本店 3F");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("J'adore Chayamachi (カフェ)");
					text3.setText("大阪市北区鶴野町4-11 朝日プラザ 1F");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DOWNSTAIRS COFFEE (カフェ)");
					text3.setText("大阪市北区大深町3-1 グランフロント大阪 ナレッジキャピタル 1F");
					break;
				case 21:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("SOLVIVA (カフェ)");
					text3.setText("大阪市北区茶屋町19-1 梅田芸術劇場1F");
					break;
				case 22:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Monsoon Cafe (カフェ)");
					text3.setText("大阪市北区茶屋町15-22 アーバンテラス茶屋町A棟 4F");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ツェープラス (カフェ)");
					text3.setText("大阪市北区茶屋町8-26 NU茶屋町プラス3F");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 3:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("国立国際美術館");
					text3.setText("大阪市北区中之島4-2-55");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
			break;

		case 2:
			switch (c) {
			case 0:
				switch (random7) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Planet3rd (カフェ)");
					text3.setText("大阪市中央区西心斎橋1-5-24 ハートンホテル心斎橋1");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ベリーファンシー (カフェ)");
					text3.setText("大阪市中央区心斎橋筋1-5-24 蔵人心斎橋ビル 2F 3F");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("北極星 (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-7-27");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("COCOASHOP　AKAI TORI (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-7-25 金子ビル2F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TABLES CAFE (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-5-15 クロスホテル大阪 1F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STANDARD BOOKSTORE (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-2-12クリスタグランドビル1FBF");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("UMIYA CAFE westpoint (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-16-14 宝泉ビル 1F");
					break;
				}
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 1:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("該当なし");
					text3.setText("");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 2:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random7) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Planet3rd (カフェ)");
					text3.setText("大阪市中央区西心斎橋1-5-24 ハートンホテル心斎橋1");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ベリーファンシー (カフェ)");
					text3.setText("大阪市中央区心斎橋筋1-5-24 蔵人心斎橋ビル 2F 3F");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("北極星 (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-7-27");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("COCOASHOP　AKAI TORI (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-7-25 金子ビル2F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TABLES CAFE (カフェ)");
					text3.setText("大阪市中央区心斎橋筋2-5-15 クロスホテル大阪 1F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STANDARD BOOKSTORE (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-2-12クリスタグランドビル1FBF");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("UMIYA CAFE westpoint (カフェ)");
					text3.setText("大阪市中央区西心斎橋2-16-14 宝泉ビル 1F");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 3:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("該当なし");
					text3.setText("");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
			break;

		case 3:
			switch (c) {
			case 0:
				switch (random10) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クレープリー　アルション (カフェ)");
					text3.setText("大阪市中央区難波1-4-18");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARABIYA (カフェ)");
					text3.setText("大阪市中央区難波1-6-7");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("和カフェyusoshi chano-ma なんばマルイ店 (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 7F");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("BUTTERFLY (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 2F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe The Plant Room (カフェ)");
					text3.setText("大阪市中央区難波3-7-11");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MINGUS (カフェ)");
					text3.setText("大阪市中央区難波5-1-60 なんばCITY 本館 B2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ANTICO CAFFE ALAVIS (カフェ)");
					text3.setText("大阪市浪速区難波中2-10-70 なんばパークス 2F");
					break;
				case 8:
					image1.setImageResource(R.drawable.osaka_anaba6_nambaparks);
					text2.setText("なんばパークス");
					text3.setText("大阪市浪速区難波中2-10-70");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LOBBY CAFE FASCINO (カフェ)");
					text3.setText("大阪市中央区難波5-1-18 なんばダイニングメゾン 7F");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafe de la Paix (カフェ)");
					text3.setText("大阪市中央区難波4-2-1 難波御堂筋ビルディング2階");
					break;
				}
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 1:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.osaka_anaba6_nambaparks);
					text2.setText("なんばパークス");
					text3.setText("大阪市浪速区難波中2-10-70");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 2:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random9) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クレープリー　アルション (カフェ)");
					text3.setText("大阪市中央区難波1-4-18");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARABIYA (カフェ)");
					text3.setText("大阪市中央区難波1-6-7");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("和カフェyusoshi chano-ma なんばマルイ店 (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 7F");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("BUTTERFLY (カフェ)");
					text3.setText("大阪市中央区難波3-8-9 なんばマルイ 2F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe The Plant Room (カフェ)");
					text3.setText("大阪市中央区難波3-7-11");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MINGUS (カフェ)");
					text3.setText("大阪市中央区難波5-1-60 なんばCITY 本館 B2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ANTICO CAFFE ALAVIS (カフェ)");
					text3.setText("大阪市浪速区難波中2-10-70 なんばパークス 2F");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LOBBY CAFE FASCINO (カフェ)");
					text3.setText("大阪市中央区難波5-1-18 なんばダイニングメゾン 7F");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Cafe de la Paix (カフェ)");
					text3.setText("大阪市中央区難波4-2-1 難波御堂筋ビルディング2階");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 3:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("該当なし");
					text3.setText("");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
			break;

		case 4:
			switch (c) {
			case 0:
				switch (random7) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("miss evans (カフェ)");
					text3.setText("大阪市阿倍野区文の里4-3-5");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DJANGO (カフェ)");
					text3.setText("大阪市阿倍野区王子町2-4-11 第2ナカビル 1F");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("j.s. pancake cafe (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-48 天王寺ミオ プラザ館 2F");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("メゾンカイザー あべのハルカス近鉄本店 タワー館 (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋1-1-43 あべのハルカス近鉄本店 タワー館 1F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Oval (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋2-4-45 2F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("aureole d’ange (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-39 天王寺ミオ 2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("あべの Q's MALL");
					text3.setText("大阪市阿倍野区阿倍野筋1-6-1");
					break;
				}
				SharedPreferences.Editor edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 1:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("あべの Q's MALL");
					text3.setText("大阪市阿倍野区阿倍野筋1-6-1");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 2:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random6) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("miss evans (カフェ)");
					text3.setText("大阪市阿倍野区文の里4-3-5");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("DJANGO (カフェ)");
					text3.setText("大阪市阿倍野区王子町2-4-11 第2ナカビル 1F");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("j.s. pancake cafe (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-48 天王寺ミオ プラザ館 2F");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("メゾンカイザー あべのハルカス近鉄本店 タワー館 (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋1-1-43 あべのハルカス近鉄本店 タワー館 1F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Oval (カフェ)");
					text3.setText("大阪市阿倍野区阿倍野筋2-4-45 2F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("aureole d’ange (カフェ)");
					text3.setText("大阪市天王寺区悲田院町10-39 天王寺ミオ 2F");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			case 3:
				edit = mSharedPreferences.edit();
				edit.putInt("c", c);
				edit.commit();
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("該当なし");
					text3.setText("");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
			break;
		}
	}

	public void doAction1(View v) {
		b = mSharedPreferences.getInt("b", 0);
		if (b > 1) {
			b = b - 1;
			SharedPreferences.Editor edit = mSharedPreferences.edit();
			edit.putInt("b", b);
			edit.commit();
			Intent intent1 = new Intent(Other4Activity.this,
					Other4Activity.class);
			startActivity(intent1);
		} else {
			b = b - 1;
			SharedPreferences.Editor edit = mSharedPreferences.edit();
			edit.putInt("b", b);
			edit.commit();
			Intent intent1 = new Intent(Other4Activity.this, MainActivity.class);
			startActivity(intent1);
		}
	}

	public void doAction2(View v) {
		Intent intent1 = new Intent(Other4Activity.this, Other2Activity.class);
		startActivity(intent1);
	}

	public void doAction3(View v) {

		String url1 = "http://maps.google.com/maps?daddr=";
		Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW,
				Uri.parse(url1));
		startActivity(intent1);

	}

}
