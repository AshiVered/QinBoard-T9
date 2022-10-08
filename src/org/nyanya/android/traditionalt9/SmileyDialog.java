package org.nyanya.android.traditionalt9;

import android.content.Context;
import android.view.View;

public class SmileyDialog extends AbsSymDialog {

	private static final String[] symbols = {
		// lol wiki http://en.wikipedia.org/wiki/List_of_emoticons
		".", ",", "?", "!", "'","“", "@", "#", "$", "₪", "%", "^",
		"&", "*", "(", ")", "-", "_", "|", "[", "]", "\u002F",
		"{", "}", ":", ";", "+","=","😀","😘","😥","😍","☺️","😐","😞","😂","\uD83D\uDE09","\uD83D\uDE4C","👏","👍","👎","💪","\uD83D\uDCAF","😱","\uD83D\uDCA4","\uD83D\uDE37","\uD83D\uDE05","\uD83D\uDE06","🙈","🍕",
			"😭","\uD83D\uDE2F","\uD83D\uDE2C","\uD83D\uDC4A","🍏","🍐","🍊","🍋","🍌","🍇","🍧","🍷","🍻","🍞",
			"⚽","\uD83D\uDE47\u200D","🚗","\uD83D\uDC6A","🏠","\uD83D\uDE4F","❤️","\uD83D\uDC76","☕",
			"🌞","🌝","🙍","💁","🏃","🎮","💇️","🍰","🎶","🔥","\uD83D\uDD53","\uD83C\uDF0E","\uD83D\uDCA3","\uD83D\uDCF5","✡️", "\uD83D\uDCD6", "✌️" };

	private static final int MAX_PAGE = (int) Math.ceil(symbols.length / 10.0);

	public SmileyDialog(Context c, View mv) {
		super(c, mv);

	}

	@Override
	String[] getContentDescription() {
		return context.getResources().getStringArray(R.array.smileyContentDescription);
	}

	@Override
	protected String getSymbol(int index) {
		return symbols[index];
	}

	@Override
	protected String getTitleText() {
		return context.getString(R.string.smiley_insert);
	}

	@Override
	protected int getSymbolSize() {
		return symbols.length;
	}

	@Override
	protected int getMaxPage() {
		return MAX_PAGE;
	}

}
