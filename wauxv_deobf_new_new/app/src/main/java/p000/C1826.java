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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲇᲈᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1826 extends View {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final RectF f6074;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Paint f6075;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Paint f6076;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Paint f6077;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1830 f6078;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826(C1830 c1830, Context context) {
        super(context);
        this.f6078 = c1830;
        this.f6074 = new RectF();
        this.f6075 = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f6076 = paint;
        this.f6077 = new Paint(1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String[] strArr = AbstractC1471.f5234;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float width = getWidth();
        float height2 = getHeight();
        RectF rectF = this.f6074;
        rectF.set(0.0f, 0.0f, width, height2);
        Paint paint = this.f6075;
        paint.setShader(null);
        C1830 c1830 = this.f6078;
        paint.setColor(Color.parseColor(MagicFactory.get(c1830.m3728() ? -519721107585667L : -519764057258627L, strArr)));
        canvas.drawRoundRect(rectF, height, height, paint);
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getHeight() * 0.78f, new int[]{Color.parseColor(MagicFactory.get(c1830.m3728() ? -519807006931587L : -519849956604547L, strArr)), Color.parseColor(MagicFactory.get(c1830.m3728() ? -519892906277507L : -519935855950467L, strArr)), 0}, new float[]{0.0f, 0.34f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint2 = this.f6077;
        paint2.setShader(linearGradient);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float fM3727 = c1830.m3727(1.0f);
        Paint paint3 = this.f6076;
        paint3.setStrokeWidth(fM3727);
        paint3.setColor(Color.parseColor(MagicFactory.get(c1830.m3728() ? -519978805623427L : -520021755296387L, strArr)));
        canvas.drawRoundRect(rectF.left + (paint3.getStrokeWidth() / 2.0f), rectF.top + (paint3.getStrokeWidth() / 2.0f), rectF.right - (paint3.getStrokeWidth() / 2.0f), rectF.bottom - (paint3.getStrokeWidth() / 2.0f), height, height, paint3);
    }
}
