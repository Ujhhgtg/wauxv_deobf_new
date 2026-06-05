package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1777feyxiexzfUjhhgtg extends ReplacementSpan {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C1776feyxiexzfUjhhgtg f5957Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public TextPaint f5960Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Paint.FontMetricsInt f5956Ujhhgtgfeyxiexzf = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public short f5958Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public float f5959Ujhhgtgfeyxiexzf = 1.0f;

    public C1777feyxiexzfUjhhgtg(C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg) {
        AbstractC3594Ujhhgtgfeyxiexzf.m5169Ujhhgtgfeyxiexzf(c1776feyxiexzfUjhhgtg, "rasterizer cannot be null");
        this.f5957Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5960Ujhhgtgfeyxiexzf;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5960Ujhhgtgfeyxiexzf = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f5958Ujhhgtgfeyxiexzf, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C3391Ujhhgtgfeyxiexzf.m4907Ujhhgtgfeyxiexzf().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg = this.f5957Ujhhgtgfeyxiexzf;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg.f5954Ujhhgtgfeyxiexzf;
        Typeface typeface = (Typeface) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf, c1776feyxiexzfUjhhgtg.f5953Ujhhgtgfeyxiexzf * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5956Ujhhgtgfeyxiexzf;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C1776feyxiexzfUjhhgtg c1776feyxiexzfUjhhgtg = this.f5957Ujhhgtgfeyxiexzf;
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.m1223Ujhhgtgfeyxiexzf(14);
        this.f5959Ujhhgtgfeyxiexzf = fAbs / (iM1223Ujhhgtgfeyxiexzf != 0 ? ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1358Ujhhgtgfeyxiexzf).getShort(iM1223Ujhhgtgfeyxiexzf + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf.f1355Ujhhgtgfeyxiexzf) : (short) 0);
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2 = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf2 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.m1223Ujhhgtgfeyxiexzf(14);
        if (iM1223Ujhhgtgfeyxiexzf2 != 0) {
            ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1358Ujhhgtgfeyxiexzf).getShort(iM1223Ujhhgtgfeyxiexzf2 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf2.f1355Ujhhgtgfeyxiexzf);
        }
        C0379Ujhhgtgfeyxiexzf c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3 = c1776feyxiexzfUjhhgtg.m3098Ujhhgtgfeyxiexzf();
        int iM1223Ujhhgtgfeyxiexzf3 = c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.m1223Ujhhgtgfeyxiexzf(12);
        short s = (short) ((iM1223Ujhhgtgfeyxiexzf3 != 0 ? ((ByteBuffer) c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.f1358Ujhhgtgfeyxiexzf).getShort(iM1223Ujhhgtgfeyxiexzf3 + c0379UjhhgtgfeyxiexzfM3098Ujhhgtgfeyxiexzf3.f1355Ujhhgtgfeyxiexzf) : (short) 0) * this.f5959Ujhhgtgfeyxiexzf);
        this.f5958Ujhhgtgfeyxiexzf = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
