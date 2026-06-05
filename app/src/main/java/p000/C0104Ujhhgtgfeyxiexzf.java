package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ能不能ᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0104Ujhhgtgfeyxiexzf extends View {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final RectF f1218Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Paint f1219Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Paint f1220Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Paint f1221Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ C0113Ujhhgtgfeyxiexzf f1222Ujhhgtgfeyxiexzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104Ujhhgtgfeyxiexzf(C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf, Context context) {
        super(context);
        this.f1222Ujhhgtgfeyxiexzf = c0113Ujhhgtgfeyxiexzf;
        this.f1218Ujhhgtgfeyxiexzf = new RectF();
        this.f1219Ujhhgtgfeyxiexzf = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f1220Ujhhgtgfeyxiexzf = paint;
        this.f1221Ujhhgtgfeyxiexzf = new Paint(1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float width = getWidth();
        float height2 = getHeight();
        RectF rectF = this.f1218Ujhhgtgfeyxiexzf;
        rectF.set(0.0f, 0.0f, width, height2);
        Paint paint = this.f1219Ujhhgtgfeyxiexzf;
        paint.setShader(null);
        C0113Ujhhgtgfeyxiexzf c0113Ujhhgtgfeyxiexzf = this.f1222Ujhhgtgfeyxiexzf;
        paint.setColor(Color.parseColor(MagicFactory.get(c0113Ujhhgtgfeyxiexzf.m1174Ujhhgtgfeyxiexzf() ? 4928347467465885066L : 4928347561955165578L, strArr)));
        canvas.drawRoundRect(rectF, height, height, paint);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight() * 0.78f, new int[]{Color.parseColor(MagicFactory.get(c0113Ujhhgtgfeyxiexzf.m1174Ujhhgtgfeyxiexzf() ? 4928347519005492618L : 4928346513983145354L, strArr)), Color.parseColor(MagicFactory.get(c0113Ujhhgtgfeyxiexzf.m1174Ujhhgtgfeyxiexzf() ? 4928346471033472394L : 4928346565522752906L, strArr)), 0}, new float[]{0.0f, 0.34f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint2 = this.f1221Ujhhgtgfeyxiexzf;
        paint2.setShader(linearGradient);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float fM1173Ujhhgtgfeyxiexzf = c0113Ujhhgtgfeyxiexzf.m1173Ujhhgtgfeyxiexzf(1.0f);
        Paint paint3 = this.f1220Ujhhgtgfeyxiexzf;
        paint3.setStrokeWidth(fM1173Ujhhgtgfeyxiexzf);
        paint3.setColor(Color.parseColor(MagicFactory.get(c0113Ujhhgtgfeyxiexzf.m1174Ujhhgtgfeyxiexzf() ? 4928346660012033418L : 4928346617062360458L, strArr)));
        canvas.drawRoundRect(rectF.left + (paint3.getStrokeWidth() / 2.0f), rectF.top + (paint3.getStrokeWidth() / 2.0f), rectF.right - (paint3.getStrokeWidth() / 2.0f), rectF.bottom - (paint3.getStrokeWidth() / 2.0f), height, height, paint3);
    }
}
