package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᛸᤞᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2339 extends AbstractC1144 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2339(AbstractC2546 abstractC2546, int i) {
        super(abstractC2546);
        this.f7548 = i;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final int mo2881(View view) {
        int iM4480;
        int i;
        switch (this.f7548) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4480 = AbstractC2546.m4480(view);
                i = ((ViewGroup.MarginLayoutParams) c2547).rightMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4480 = AbstractC2546.m4476(view);
                i = ((ViewGroup.MarginLayoutParams) c2548).bottomMargin;
                break;
        }
        return iM4480 + i;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2882(View view) {
        int iM4479;
        int i;
        switch (this.f7548) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4479 = AbstractC2546.m4479(view) + ((ViewGroup.MarginLayoutParams) c2547).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2547).rightMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4479 = AbstractC2546.m4478(view) + ((ViewGroup.MarginLayoutParams) c2548).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2548).bottomMargin;
                break;
        }
        return iM4479 + i;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo2883(View view) {
        int iM4478;
        int i;
        switch (this.f7548) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4478 = AbstractC2546.m4478(view) + ((ViewGroup.MarginLayoutParams) c2547).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c2547).bottomMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4478 = AbstractC2546.m4479(view) + ((ViewGroup.MarginLayoutParams) c2548).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c2548).rightMargin;
                break;
        }
        return iM4478 + i;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo2884(View view) {
        int iM4477;
        int i;
        switch (this.f7548) {
            case 0:
                C2547 c2547 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4477 = AbstractC2546.m4477(view);
                i = ((ViewGroup.MarginLayoutParams) c2547).leftMargin;
                break;
            default:
                C2547 c2548 = (C2547) view.getLayoutParams();
                ((AbstractC2546) this.f4245).getClass();
                iM4477 = AbstractC2546.m4481(view);
                i = ((ViewGroup.MarginLayoutParams) c2548).topMargin;
                break;
        }
        return iM4477 - i;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2885() {
        switch (this.f7548) {
            case 0:
                return ((AbstractC2546) this.f4245).f8105;
            default:
                return ((AbstractC2546) this.f4245).f8106;
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final int mo2886() {
        int i;
        int iM4493;
        switch (this.f7548) {
            case 0:
                AbstractC2546 abstractC2546 = (AbstractC2546) this.f4245;
                i = abstractC2546.f8105;
                iM4493 = abstractC2546.m4493();
                break;
            default:
                AbstractC2546 abstractC2547 = (AbstractC2546) this.f4245;
                i = abstractC2547.f8106;
                iM4493 = abstractC2547.m4491();
                break;
        }
        return i - iM4493;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final int mo2887() {
        switch (this.f7548) {
            case 0:
                return ((AbstractC2546) this.f4245).m4493();
            default:
                return ((AbstractC2546) this.f4245).m4491();
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final int mo2888() {
        switch (this.f7548) {
            case 0:
                return ((AbstractC2546) this.f4245).f8103;
            default:
                return ((AbstractC2546) this.f4245).f8104;
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final int mo2889() {
        switch (this.f7548) {
            case 0:
                return ((AbstractC2546) this.f4245).f8104;
            default:
                return ((AbstractC2546) this.f4245).f8103;
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo2890() {
        switch (this.f7548) {
            case 0:
                return ((AbstractC2546) this.f4245).m4492();
            default:
                return ((AbstractC2546) this.f4245).m4494();
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final int mo2891() {
        int iM4492;
        int iM4493;
        switch (this.f7548) {
            case 0:
                AbstractC2546 abstractC2546 = (AbstractC2546) this.f4245;
                iM4492 = abstractC2546.f8105 - abstractC2546.m4492();
                iM4493 = abstractC2546.m4493();
                break;
            default:
                AbstractC2546 abstractC2547 = (AbstractC2546) this.f4245;
                iM4492 = abstractC2547.f8106 - abstractC2547.m4494();
                iM4493 = abstractC2547.m4491();
                break;
        }
        return iM4492 - iM4493;
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final int mo2892(View view) {
        switch (this.f7548) {
            case 0:
                AbstractC2546 abstractC2546 = (AbstractC2546) this.f4245;
                Rect rect = (Rect) this.f4246;
                abstractC2546.m4495(rect, view);
                return rect.right;
            default:
                AbstractC2546 abstractC2547 = (AbstractC2546) this.f4245;
                Rect rect2 = (Rect) this.f4246;
                abstractC2547.m4495(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public final int mo2893(View view) {
        switch (this.f7548) {
            case 0:
                AbstractC2546 abstractC2546 = (AbstractC2546) this.f4245;
                Rect rect = (Rect) this.f4246;
                abstractC2546.m4495(rect, view);
                return rect.left;
            default:
                AbstractC2546 abstractC2547 = (AbstractC2546) this.f4245;
                Rect rect2 = (Rect) this.f4246;
                abstractC2547.m4495(rect2, view);
                return rect2.top;
        }
    }

    @Override // p000.AbstractC1144
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final void mo2894(int i) {
        switch (this.f7548) {
            case 0:
                ((AbstractC2546) this.f4245).mo263(i);
                break;
            default:
                ((AbstractC2546) this.f4245).mo264(i);
                break;
        }
    }
}
