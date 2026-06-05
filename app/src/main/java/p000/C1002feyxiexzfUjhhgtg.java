package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1002feyxiexzfUjhhgtg extends ViewOutlineProvider {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Rect f3920Ujhhgtgfeyxiexzf = new Rect();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ShapeableImageView f3921Ujhhgtgfeyxiexzf;

    public C1002feyxiexzfUjhhgtg(ShapeableImageView shapeableImageView) {
        this.f3921Ujhhgtgfeyxiexzf = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.f3921Ujhhgtgfeyxiexzf;
        if (shapeableImageView.f792Ujhhgtgfeyxiexzf == null) {
            return;
        }
        if (shapeableImageView.f791Ujhhgtgfeyxiexzf == null) {
            shapeableImageView.f791Ujhhgtgfeyxiexzf = new C0226Ujhhgtgfeyxiexzf(shapeableImageView.f792Ujhhgtgfeyxiexzf);
        }
        RectF rectF = shapeableImageView.f785Ujhhgtgfeyxiexzf;
        Rect rect = this.f3920Ujhhgtgfeyxiexzf;
        rectF.round(rect);
        shapeableImageView.f791Ujhhgtgfeyxiexzf.setBounds(rect);
        shapeableImageView.f791Ujhhgtgfeyxiexzf.getOutline(outline);
    }
}
