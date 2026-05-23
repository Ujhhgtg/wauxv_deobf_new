package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤝᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2689 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Rect f8679 = new Rect();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ShapeableImageView f8680;

    public C2689(ShapeableImageView shapeableImageView) {
        this.f8680 = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f8680;
        if (shapeableImageView.f712 == null) {
            return;
        }
        if (shapeableImageView.f711 == null) {
            shapeableImageView.f711 = new C1917(shapeableImageView.f712);
        }
        RectF rectF = shapeableImageView.f705;
        Rect rect = this.f8679;
        rectF.round(rect);
        shapeableImageView.f711.setBounds(rect);
        shapeableImageView.f711.getOutline(outline);
    }
}
