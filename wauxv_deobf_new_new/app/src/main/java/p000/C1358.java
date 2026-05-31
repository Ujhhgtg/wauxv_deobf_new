package p000;

import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1358 extends AbstractC2563 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final MaterialTextView f4863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final MaterialTextView f4864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final MaterialCheckBox f4865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final ShapeableImageView f4866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public final ShapeableImageView f4867;

    public C1358(View view) {
        super(view);
        this.f4863 = (MaterialTextView) view.findViewById(R.id.itemFabMenuTvTitle);
        this.f4864 = (MaterialTextView) view.findViewById(R.id.itemFabMenuTvDesc);
        this.f4865 = (MaterialCheckBox) view.findViewById(R.id.itemFabMenuCbEnable);
        this.f4866 = (ShapeableImageView) view.findViewById(R.id.itemFabMenuIvEdit);
        this.f4867 = (ShapeableImageView) view.findViewById(R.id.itemFabMenuIvDelete);
    }
}
