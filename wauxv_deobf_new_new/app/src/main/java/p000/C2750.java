package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᤞᤝᛸᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2750 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Rect f8849 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ShapeableImageView f8850;

    public C2750(ShapeableImageView shapeableImageView) {
        this.f8850 = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f8850;
        if (shapeableImageView.f778 == null) {
            return;
        }
        if (shapeableImageView.f777 == null) {
            shapeableImageView.f777 = new C1948(shapeableImageView.f778);
        }
        RectF rectF = shapeableImageView.f771;
        Rect rect = this.f8849;
        rectF.round(rect);
        shapeableImageView.f777.setBounds(rect);
        shapeableImageView.f777.getOutline(outline);
    }
}
