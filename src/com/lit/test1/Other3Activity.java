package com.lit.test1;

import java.util.Random;

import twitter4j.AsyncTwitter;
import twitter4j.AsyncTwitterFactory;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Other3Activity extends Activity {

	String apiKey = "CvcXr4mWFHRnkk4eEBgbC2q2D";
	String apiSecret = "UxHUzNcMwBMBRvQgHeTLdRZ8QWvQbZUn8MyIOWs3wE07URXpWA";

	AsyncTwitter twitter;

	int a, b, c, d, f;
	Random r = new Random();
	int random1 = r.nextInt(1);
	int random2 = r.nextInt(2);
	int random3 = r.nextInt(3);
	int random6 = r.nextInt(6);
	int random14 = r.nextInt(14);
	int random16 = r.nextInt(16);
	int random19 = r.nextInt(19);
	int random34 = r.nextInt(34);
	int random50 = r.nextInt(50);

	private SharedPreferences mSharedPreferences;
	TextView text3;

	// 更新されているか確認のためのコメント

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other3);

		setTitle("HolidayMaster");

		TextView text1 = (TextView) findViewById(R.id.text1);
		TextView text2 = (TextView) findViewById(R.id.text2);
		text3 = (TextView) findViewById(R.id.text3);
		text1.setText("東京で遊べる検索結果です。");

		mSharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(this);

		AsyncTwitterFactory factory = new AsyncTwitterFactory();
		twitter = factory.getInstance();
		twitter.setOAuthConsumer(apiKey, apiSecret);

		ImageView image1 = (ImageView) findViewById(R.id.image1);

		c = mSharedPreferences.getInt("c", 0);
		d = mSharedPreferences.getInt("d", 0);
		f = mSharedPreferences.getInt("f", 0);

		switch (f) {
		case 0:
			switch (c) {
			case 0:
				switch (random50) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Eggs 'n Things 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前4-30-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.tokyo_anaba3_ameyoko);
					text2.setText("アメ横商店街");
					text3.setText("台東区上野");
					break;
				case 3:
					image1.setImageResource(R.drawable.tokyo_anaba2_nihonkagakumiraikan);
					text2.setText("日本未来科学館");
					text3.setText("江東区青海2-3-6");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("カルビープラス 東京駅店 (カフェ)");
					text3.setText("千代田区丸の内１丁目9-1");
					break;
				case 5:
					image1.setImageResource(R.drawable.tokyo_anaba1_tokyosoramachi);
					text2.setText("東京ソラマチ");
					text3.setText("墨田区押上1-1-2");
					break;
				case 6:
					image1.setImageResource(R.drawable.tokyo_anaba9_shibuyahikarie);
					text2.setText("渋谷ヒカリエ");
					text3.setText("渋谷区渋谷2-21-1");
					break;
				case 7:
					image1.setImageResource(R.drawable.tokyo_anaba10_ebisugarden);
					text2.setText("恵比寿ガーデンプレイス");
					text3.setText("渋谷区恵比寿4 恵比寿ガーデンプレイス");
					break;
				case 8:
					image1.setImageResource(R.drawable.tokyo_anaba11_tokyodaizinguu);
					text2.setText("東京大神宮");
					text3.setText("千代田区富士見2-4-1");
					break;
				case 9:
					image1.setImageResource(R.drawable.tokyo_anaba12_kokuritusinbizyutukan);
					text2.setText("国立新美術館");
					text3.setText("港区六本木7-22-2");
					break;
				case 10:
					image1.setImageResource(R.drawable.tokyo_anaba13_tokyotower);
					text2.setText("東京タワー");
					text3.setText("港区芝公園4-2-8");
					break;
				case 11:
					image1.setImageResource(R.drawable.tokyo_anaba14_roppongi);
					text2.setText("六本木ヒルズ展望台　東京シティービュー");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー52F／屋上");
					break;
				case 12:
					image1.setImageResource(R.drawable.tokyo_anaba15_coffee);
					text2.setText("珈琲天国 (カフェ)");
					text3.setText("台東区浅草1-41-9");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("森美術館");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー53F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe ordinaire (カフェ)");
					text3.setText("世田谷区北沢3-25-1 下北沢MTビル3&4階");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブック・カフェ　槐多 (カフェ)");
					text3.setText("世田谷区松原2-43-11");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAFE RASHIKU (カフェ)");
					text3.setText("世田谷区南烏山5-33-8 2F");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brooklyn Parlor (カフェ)");
					text3.setText("新宿区新宿3-1-26 新宿マルイ アネックス B1F");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAT'S CRADLE (カフェ)");
					text3.setText("新宿区早稲田鶴巻町538番地　岩田ビル1F");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dexee Diner (カフェ)");
					text3.setText("渋谷区東2-26-16");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Bibliotheque (カフェ)");
					text3.setText("渋谷区千駄ヶ谷3-54-2");
					break;
				case 21:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MOTOYA Book・Cafe・Gallery (カフェ)");
					text3.setText("渋谷区初台2-24-7");
					break;
				case 22:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Library Lounge THESE (カフェ)");
					text3.setText("港区西麻布2-15-12カルテットビル1F");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Rainy Day Bookstore & Cafe (カフェ)");
					text3.setText("港区西麻布2-21-28 B1F");
					break;
				case 24:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TSUTAYA TOKYO ROPPOBNGI (カフェ)");
					text3.setText("港区六本木6-11-1 六本木ヒルズ六本木けやき坂通り");
					break;
				case 25:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARGO (カフェ)");
					text3.setText("千代田区麹町1-4-2 One Four Two by tojo 9階");
					break;
				case 26:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("combine (カフェ)");
					text3.setText("目黒区中目黒1-10-23リバーサイドテラス103");
					break;
				case 27:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LA・VITA (カフェ)");
					text3.setText("目黒区自由が丘2-8-2");
					break;
				case 28:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ダイバーシティ東京 プラザ");
					text3.setText("江東区青海1-1-10");
					break;
				case 29:
					image1.setImageResource(R.drawable.tokyo_anaba4_siosaitoitaria);
					text2.setText("汐留シオサイト5区イタリア街");
					text3.setText("港区東新橋2");
					break;
				case 30:
					image1.setImageResource(R.drawable.tokyo_anaba5_akasakasakasu);
					text2.setText("赤坂サカス");
					text3.setText("港区赤坂5-3");
					break;
				case 31:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Spiral Market");
					text3.setText("港区南青山5-6-23 スパイラル2F");
					break;
				case 32:
					image1.setImageResource(R.drawable.tokyo_anaba6_karettasiodome);
					text2.setText("カレッタ汐留");
					text3.setText("港区東新橋1-8-2");
					break;
				case 33:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("表参道ヒルズ");
					text3.setText("渋谷区神宮前4-12-10");
					break;
				case 34:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ホノルルコーヒー (カフェ)");
					text3.setText("江東区青海1-1 ダイバーシティ東京 プラザ2F");
					break;
				case 35:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クリスピー・クリーム・ドーナツ 新宿サザンテラス店 (カフェ)");
					text3.setText("渋谷区代々木2-2-2 新宿サザンテラス内");
					break;
				case 36:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PANINO VINO (カフェ)");
					text3.setText("渋谷区神宮前4-5-12 セピア原宿ビル 1F");
					break;
				case 37:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Deux Anges (カフェ)");
					text3.setText("渋谷区神宮前5-47-11");
					break;
				case 38:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brasserie cafe' Le Conte (カフェ)");
					text3.setText("南青山3-18-19 フェスタ表参道ビル新館 3F");
					break;
				case 39:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe table TERRACE (カフェ)");
					text3.setText("港区北青山3-11-7 AOビル3F");
					break;
				case 40:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dining cafe HOME (カフェ)");
					text3.setText("渋谷区神宮前5-11-1");
					break;
				case 41:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NALU cafe omotesando (カフェ)");
					text3.setText("渋谷区神宮前4-9-2 神宮前MMビル１F");
					break;
				case 42:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TOWN DESIGN CAFE Jingumae (カフェ)");
					text3.setText("渋谷区神宮前5-7-18 プラザ青山　１Ｆ");
					break;
				case 43:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STaiR (カフェ)");
					text3.setText("港区南青山5-5-1 ２Ｆ");
					break;
				case 44:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("C’s fort (カフェ)");
					text3.setText("港区北青山3-9-2 AQUA １Ｆ");
					break;
				case 45:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ジェイエスバーガーズカフェ 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前6-6-2 2F");
					break;
				case 46:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RFECTOIRE (カフェ)");
					text3.setText("渋谷区神宮前6-25-10 タケオキクチビル 3F");
					break;
				case 47:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("THE GREAT BURGER (カフェ)");
					text3.setText("渋谷区神宮前6-12-5 1F");
					break;
				case 48:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("uzna omom (カフェ)");
					text3.setText("渋谷区神宮前5-17-8 原宿XS203号");
					break;
				case 49:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("montoak (カフェ)");
					text3.setText("渋谷区神宮前6-1-9");
					break;
				case 50:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("エコファームカフェ 632 (カフェ)");
					text3.setText("渋谷区神宮前6-32-10");
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
				switch (random6) {
				case 1:
					image1.setImageResource(R.drawable.tokyo_anaba1_tokyosoramachi);
					text2.setText("東京ソラマチ");
					text3.setText("墨田区押上1-1-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.tokyo_anaba10_ebisugarden);
					text2.setText("恵比寿ガーデンプレイス");
					text3.setText("渋谷区恵比寿4 恵比寿ガーデンプレイス");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ダイバーシティ東京 プラザ");
					text3.setText("江東区青海1-1-10");
					break;
				case 4:
					image1.setImageResource(R.drawable.tokyo_anaba4_siosaitoitaria);
					text2.setText("汐留シオサイト5区イタリア街");
					text3.setText("港区東新橋2");
					break;
				case 5:
					image1.setImageResource(R.drawable.tokyo_anaba5_akasakasakasu);
					text2.setText("赤坂サカス");
					text3.setText("港区赤坂5-3");
					break;
				case 6:
					image1.setImageResource(R.drawable.tokyo_anaba6_karettasiodome);
					text2.setText("カレッタ汐留");
					text3.setText("港区東新橋1-8-2");
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
				switch (random34) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Eggs 'n Things 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前4-30-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("カルビープラス 東京駅店 (カフェ)");
					text3.setText("千代田区丸の内１丁目9-1");
					break;
				case 3:
					image1.setImageResource(R.drawable.tokyo_anaba15_coffee);
					text2.setText("珈琲天国 (カフェ)");
					text3.setText("台東区浅草1-41-9");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe ordinaire (カフェ)");
					text3.setText("世田谷区北沢3-25-1 下北沢MTビル3&4階");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブック・カフェ　槐多 (カフェ)");
					text3.setText("世田谷区松原2-43-11");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAFE RASHIKU (カフェ)");
					text3.setText("世田谷区南烏山5-33-8 2F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brooklyn Parlor (カフェ)");
					text3.setText("新宿区新宿3-1-26 新宿マルイ アネックス B1F");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAT'S CRADLE (カフェ)");
					text3.setText("新宿区早稲田鶴巻町538番地　岩田ビル1F");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dexee Diner (カフェ)");
					text3.setText("渋谷区東2-26-16");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Bibliotheque (カフェ)");
					text3.setText("渋谷区千駄ヶ谷3-54-2");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MOTOYA Book・Cafe・Gallery (カフェ)");
					text3.setText("渋谷区初台2-24-7");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Library Lounge THESE (カフェ)");
					text3.setText("港区西麻布2-15-12カルテットビル1F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Rainy Day Bookstore & Cafe (カフェ)");
					text3.setText("港区西麻布2-21-28 B1F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TSUTAYA TOKYO ROPPOBNGI (カフェ)");
					text3.setText("港区六本木6-11-1 六本木ヒルズ六本木けやき坂通り");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ARGO (カフェ)");
					text3.setText("千代田区麹町1-4-2 One Four Two by tojo 9階");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("combine (カフェ)");
					text3.setText("目黒区中目黒1-10-23リバーサイドテラス103");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LA・VITA (カフェ)");
					text3.setText("目黒区自由が丘2-8-2");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ホノルルコーヒー (カフェ)");
					text3.setText("江東区青海1-1 ダイバーシティ東京 プラザ2F");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クリスピー・クリーム・ドーナツ 新宿サザンテラス店 (カフェ)");
					text3.setText("渋谷区代々木2-2-2 新宿サザンテラス内");
					break;
				case 20:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PANINO VINO (カフェ)");
					text3.setText("渋谷区神宮前4-5-12 セピア原宿ビル 1F");
					break;
				case 21:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Deux Anges (カフェ)");
					text3.setText("渋谷区神宮前5-47-11");
					break;
				case 22:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brasserie cafe' Le Conte (カフェ)");
					text3.setText("南青山3-18-19 フェスタ表参道ビル新館 3F");
					break;
				case 23:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe table TERRACE (カフェ)");
					text3.setText("港区北青山3-11-7 AOビル3F");
					break;
				case 24:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dining cafe HOME (カフェ)");
					text3.setText("渋谷区神宮前5-11-1");
					break;
				case 25:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NALU cafe omotesando (カフェ)");
					text3.setText("渋谷区神宮前4-9-2 神宮前MMビル１F");
					break;
				case 26:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TOWN DESIGN CAFE Jingumae (カフェ)");
					text3.setText("渋谷区神宮前5-7-18 プラザ青山　１Ｆ");
					break;
				case 27:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STaiR (カフェ)");
					text3.setText("港区南青山5-5-1 ２Ｆ");
					break;
				case 28:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("C’s fort (カフェ)");
					text3.setText("港区北青山3-9-2 AQUA １Ｆ");
					break;
				case 29:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ジェイエスバーガーズカフェ 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前6-6-2 2F");
					break;
				case 30:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RFECTOIRE (カフェ)");
					text3.setText("渋谷区神宮前6-25-10 タケオキクチビル 3F");
					break;
				case 31:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("THE GREAT BURGER (カフェ)");
					text3.setText("渋谷区神宮前6-12-5 1F");
					break;
				case 32:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("uzna omom (カフェ)");
					text3.setText("渋谷区神宮前5-17-8 原宿XS203号");
					break;
				case 33:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("montoak (カフェ)");
					text3.setText("渋谷区神宮前6-1-9");
					break;
				case 34:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("エコファームカフェ 632 (カフェ)");
					text3.setText("渋谷区神宮前6-32-10");
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
				switch (random2) {
				case 1:
					image1.setImageResource(R.drawable.tokyo_anaba12_kokuritusinbizyutukan);
					text2.setText("国立新美術館");
					text3.setText("港区六本木7-22-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("森美術館");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー53F");
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
				switch (random2) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brooklyn Parlor (カフェ)");
					text3.setText("新宿区新宿3-1-26 新宿マルイ アネックス B1F");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAT'S CRADLE (カフェ)");
					text3.setText("新宿区早稲田鶴巻町538番地　岩田ビル1F");
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
				switch (random2) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Brooklyn Parlor (カフェ)");
					text3.setText("新宿区新宿3-1-26 新宿マルイ アネックス B1F");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAT'S CRADLE (カフェ)");
					text3.setText("新宿区早稲田鶴巻町538番地　岩田ビル1F");
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

		case 2:
			switch (c) {
			case 0:
				switch (random19) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Eggs 'n Things 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前4-30-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.tokyo_anaba9_shibuyahikarie);
					text2.setText("渋谷ヒカリエ");
					text3.setText("渋谷区渋谷2-21-1");
					break;
				case 3:
					image1.setImageResource(R.drawable.tokyo_anaba10_ebisugarden);
					text2.setText("恵比寿ガーデンプレイス");
					text3.setText("渋谷区恵比寿4 恵比寿ガーデンプレイス");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dexee Diner (カフェ)");
					text3.setText("渋谷区東2-26-16");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Bibliotheque (カフェ)");
					text3.setText("渋谷区千駄ヶ谷3-54-2");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MOTOYA Book・Cafe・Gallery (カフェ)");
					text3.setText("渋谷区初台2-24-7");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("表参道ヒルズ");
					text3.setText("渋谷区神宮前4-12-10");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クリスピー・クリーム・ドーナツ 新宿サザンテラス店 (カフェ)");
					text3.setText("渋谷区代々木2-2-2 新宿サザンテラス内");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PANINO VINO (カフェ)");
					text3.setText("渋谷区神宮前4-5-12 セピア原宿ビル 1F");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Deux Anges (カフェ)");
					text3.setText("渋谷区神宮前5-47-11");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dining cafe HOME (カフェ)");
					text3.setText("渋谷区神宮前5-11-1");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NALU cafe omotesando (カフェ)");
					text3.setText("渋谷区神宮前4-9-2 神宮前MMビル１F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TOWN DESIGN CAFE Jingumae (カフェ)");
					text3.setText("渋谷区神宮前5-7-18 プラザ青山　１Ｆ");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ジェイエスバーガーズカフェ 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前6-6-2 2F");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RFECTOIRE (カフェ)");
					text3.setText("渋谷区神宮前6-25-10 タケオキクチビル 3F");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("THE GREAT BURGER (カフェ)");
					text3.setText("渋谷区神宮前6-12-5 1F");
					break;
				case 17:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("uzna omom (カフェ)");
					text3.setText("渋谷区神宮前5-17-8 原宿XS203号");
					break;
				case 18:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("montoak (カフェ)");
					text3.setText("渋谷区神宮前6-1-9");
					break;
				case 19:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("エコファームカフェ 632 (カフェ)");
					text3.setText("渋谷区神宮前6-32-10");
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
					image1.setImageResource(R.drawable.tokyo_anaba10_ebisugarden);
					text2.setText("恵比寿ガーデンプレイス");
					text3.setText("渋谷区恵比寿4 恵比寿ガーデンプレイス");
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
				switch (random16) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Eggs 'n Things 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前4-30-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dexee Diner (カフェ)");
					text3.setText("渋谷区東2-26-16");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Bibliotheque (カフェ)");
					text3.setText("渋谷区千駄ヶ谷3-54-2");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("MOTOYA Book・Cafe・Gallery (カフェ)");
					text3.setText("渋谷区初台2-24-7");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("クリスピー・クリーム・ドーナツ 新宿サザンテラス店 (カフェ)");
					text3.setText("渋谷区代々木2-2-2 新宿サザンテラス内");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("PANINO VINO (カフェ)");
					text3.setText("渋谷区神宮前4-5-12 セピア原宿ビル 1F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Deux Anges (カフェ)");
					text3.setText("渋谷区神宮前5-47-11");
					break;
				case 8:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Dining cafe HOME (カフェ)");
					text3.setText("渋谷区神宮前5-11-1");
					break;
				case 9:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("NALU cafe omotesando (カフェ)");
					text3.setText("渋谷区神宮前4-9-2 神宮前MMビル１F");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TOWN DESIGN CAFE Jingumae (カフェ)");
					text3.setText("渋谷区神宮前5-7-18 プラザ青山　１Ｆ");
					break;
				case 11:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ジェイエスバーガーズカフェ 原宿店 (カフェ)");
					text3.setText("渋谷区神宮前6-6-2 2F");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("RFECTOIRE (カフェ)");
					text3.setText("渋谷区神宮前6-25-10 タケオキクチビル 3F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("THE GREAT BURGER (カフェ)");
					text3.setText("渋谷区神宮前6-12-5 1F");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("uzna omom (カフェ)");
					text3.setText("渋谷区神宮前5-17-8 原宿XS203号");
					break;
				case 15:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("montoak (カフェ)");
					text3.setText("渋谷区神宮前6-1-9");
					break;
				case 16:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("エコファームカフェ 632 (カフェ)");
					text3.setText("渋谷区神宮前6-32-10");
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
				switch (random3) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe ordinaire (カフェ)");
					text3.setText("世田谷区北沢3-25-1 下北沢MTビル3&4階");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブック・カフェ　槐多 (カフェ)");
					text3.setText("世田谷区松原2-43-11");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAFE RASHIKU (カフェ)");
					text3.setText("世田谷区南烏山5-33-8 2F");
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
				switch (random3) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe ordinaire (カフェ)");
					text3.setText("世田谷区北沢3-25-1 下北沢MTビル3&4階");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ブック・カフェ　槐多 (カフェ)");
					text3.setText("世田谷区松原2-43-11");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("CAFE RASHIKU (カフェ)");
					text3.setText("世田谷区南烏山5-33-8 2F");
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
				switch (random3) {
				case 1:
					image1.setImageResource(R.drawable.tokyo_anaba2_nihonkagakumiraikan);
					text2.setText("日本未来科学館");
					text3.setText("江東区青海2-3-6");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ダイバーシティ東京 プラザ");
					text3.setText("江東区青海1-1-10");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ホノルルコーヒー (カフェ)");
					text3.setText("江東区青海1-1 ダイバーシティ東京 プラザ2F");
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
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ダイバーシティ東京 プラザ");
					text3.setText("江東区青海1-1-10");
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
				switch (random1) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("ホノルルコーヒー (カフェ)");
					text3.setText("江東区青海1-1 ダイバーシティ東京 プラザ2F");
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

		case 5:
			switch (c) {
			case 0:
				switch (random2) {
				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("combine");
					text3.setText("目黒区中目黒1-10-23リバーサイドテラス103");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LA・VITA");
					text3.setText("目黒区自由が丘2-8-2");
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
				switch (random2) {

				case 1:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("combine");
					text3.setText("目黒区中目黒1-10-23リバーサイドテラス103");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("LA・VITA");
					text3.setText("目黒区自由が丘2-8-2");
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

		case 6:
			switch (c) {
			case 0:
				switch (random14) {
				case 1:
					image1.setImageResource(R.drawable.tokyo_anaba12_kokuritusinbizyutukan);
					text2.setText("国立新美術館");
					text3.setText("港区六本木7-22-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.tokyo_anaba13_tokyotower);
					text2.setText("東京タワー");
					text3.setText("港区芝公園4-2-8");
					break;
				case 3:
					image1.setImageResource(R.drawable.tokyo_anaba14_roppongi);
					text2.setText("六本木ヒルズ展望台　東京シティービュー");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー52F／屋上");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("森美術館");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー53F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Library Lounge THESE (カフェ)");
					text3.setText("港区西麻布2-15-12カルテットビル1F");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Rainy Day Bookstore & Cafe (カフェ)");
					text3.setText("港区西麻布2-21-28 B1F");
					break;
				case 7:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TSUTAYA TOKYO ROPPOBNGI (カフェ)");
					text3.setText("港区六本木6-11-1 六本木ヒルズ六本木けやき坂通り");
					break;
				case 8:
					image1.setImageResource(R.drawable.tokyo_anaba4_siosaitoitaria);
					text2.setText("汐留シオサイト5区イタリア街");
					text3.setText("港区東新橋2");
					break;
				case 9:
					image1.setImageResource(R.drawable.tokyo_anaba5_akasakasakasu);
					text2.setText("赤坂サカス");
					text3.setText("港区赤坂5-3");
					break;
				case 10:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Spiral Market");
					text3.setText("港区南青山5-6-23 スパイラル2F");
					break;
				case 11:
					image1.setImageResource(R.drawable.tokyo_anaba6_karettasiodome);
					text2.setText("カレッタ汐留");
					text3.setText("港区東新橋1-8-2");
					break;
				case 12:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe table TERRACE (カフェ)");
					text3.setText("港区北青山3-11-7 AOビル3F");
					break;
				case 13:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STaiR (カフェ)");
					text3.setText("港区南青山5-5-1 ２Ｆ");
					break;
				case 14:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("C’s fort (カフェ)");
					text3.setText("港区北青山3-9-2 AQUA １Ｆ");
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
					image1.setImageResource(R.drawable.tokyo_anaba4_siosaitoitaria);
					text2.setText("汐留シオサイト5区イタリア街");
					text3.setText("港区東新橋2");
					break;
				case 2:
					image1.setImageResource(R.drawable.tokyo_anaba5_akasakasakasu);
					text2.setText("赤坂サカス");
					text3.setText("港区赤坂5-3");
					break;
				case 3:
					image1.setImageResource(R.drawable.tokyo_anaba6_karettasiodome);
					text2.setText("カレッタ汐留");
					text3.setText("港区東新橋1-8-2");
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
					text2.setText("Library Lounge THESE (カフェ)");
					text3.setText("港区西麻布2-15-12カルテットビル1F");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("Rainy Day Bookstore & Cafe (カフェ)");
					text3.setText("港区西麻布2-21-28 B1F");
					break;
				case 3:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("TSUTAYA TOKYO ROPPOBNGI (カフェ)");
					text3.setText("港区六本木6-11-1 六本木ヒルズ六本木けやき坂通り");
					break;
				case 4:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("cafe table TERRACE (カフェ)");
					text3.setText("港区北青山3-11-7 AOビル3F");
					break;
				case 5:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("STaiR (カフェ)");
					text3.setText("港区南青山5-5-1 ２Ｆ");
					break;
				case 6:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("C’s fort (カフェ)");
					text3.setText("港区北青山3-9-2 AQUA １Ｆ");
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
				switch (random2) {
				case 1:
					image1.setImageResource(R.drawable.tokyo_anaba12_kokuritusinbizyutukan);
					text2.setText("国立新美術館");
					text3.setText("港区六本木7-22-2");
					break;
				case 2:
					image1.setImageResource(R.drawable.no_image);
					text2.setText("森美術館");
					text3.setText("港区六本木6-10-1 六本木ヒルズ森タワー53F");
					break;
				}
				edit = mSharedPreferences.edit();
				edit.putInt("d", d);
				edit.commit();
				break;
			}
		}
	}

	public void doAction1(View v) {
		b = mSharedPreferences.getInt("b", 0);
		if (b > 1) {
			b = b - 1;
			SharedPreferences.Editor edit = mSharedPreferences.edit();
			edit.putInt("b", b);
			edit.commit();
			Intent intent1 = new Intent(Other3Activity.this,
					Other3Activity.class);
			startActivity(intent1);
		} else {
			b = b - 1;
			SharedPreferences.Editor edit = mSharedPreferences.edit();
			edit.putInt("b", b);
			edit.commit();
			Intent intent1 = new Intent(Other3Activity.this, MainActivity.class);
			startActivity(intent1);
		}
	}

	public void doAction2(View v) {
		Intent intent1 = new Intent(Other3Activity.this, Other2Activity.class);
		startActivity(intent1);
	}

	public void doAction3(View v) {
		// c = mSharedPreferences.getInt("c", 0);
		String url1 = "http://maps.google.com/maps?q="
				+ text3.getText().toString();

		Intent intent1 = new Intent(android.content.Intent.ACTION_VIEW,
				Uri.parse(url1));
		startActivity(intent1);
	}
}
