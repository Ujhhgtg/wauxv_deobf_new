package p000;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3406 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static WeakReference f10733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Paint f10734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Path f10735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f10736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f10737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f10738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f10739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f10740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f10741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public float f10742;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f10743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public boolean f10744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ImageView f10745;

    public C3406(Activity activity) {
        super(activity, null, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-1224624);
        this.f10734 = paint;
        this.f10735 = new Path();
        this.f10740 = 500.0f;
        this.f10741 = 100.0f;
        this.f10742 = 16.0f;
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        double d = 2;
        float f = ((-((float) Math.sqrt(((float) Math.pow(this.f10737 - this.f10741, 2.0)) + ((float) Math.pow(this.f10736 - this.f10740, 2.0))))) / 15) + 16.0f;
        this.f10742 = f;
        this.f10743 = f < 5.0f;
        double dAtan = (float) Math.atan((this.f10737 - this.f10741) / (this.f10736 - this.f10740));
        float fSin = this.f10742 * ((float) Math.sin(dAtan));
        float fCos = this.f10742 * ((float) Math.cos(dAtan));
        Path path = this.f10735;
        path.reset();
        path.moveTo(this.f10740 - fSin, this.f10741 + fCos);
        path.quadTo(this.f10738, this.f10739, this.f10736 - fSin, this.f10737 + fCos);
        path.lineTo(this.f10736 + fSin, this.f10737 - fCos);
        path.quadTo(this.f10738, this.f10739, this.f10740 + fSin, this.f10741 - fCos);
        path.close();
        if (!this.f10743 && this.f10744 && this.f10745 != null) {
            Paint paint = this.f10734;
            canvas.drawPath(path, paint);
            canvas.drawCircle(this.f10740, this.f10741, this.f10742, paint);
            canvas.drawCircle(this.f10736, this.f10737, this.f10742, paint);
        }
        super.onDraw(canvas);
    }
}
