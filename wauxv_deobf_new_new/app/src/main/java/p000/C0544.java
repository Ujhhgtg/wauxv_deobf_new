package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲀᲈᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0544 extends AbstractC1698 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f2262;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f2261 = i;
        switch (i) {
            case 1:
                this.f2262 = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f2262 = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final int mo2056() {
        switch (this.f2261) {
            case 0:
                return this.f2262.f8106;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2262;
                return carouselLayoutManager.f8106 - carouselLayoutManager.m4491();
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int mo2057() {
        switch (this.f2261) {
            case 0:
                return this.f2262.m4492();
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int mo2058() {
        switch (this.f2261) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f2262;
                return carouselLayoutManager.f8105 - carouselLayoutManager.m4493();
            default:
                return this.f2262.f8105;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int mo2059() {
        switch (this.f2261) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2262;
                if (carouselLayoutManager.m813()) {
                    return carouselLayoutManager.f8105;
                }
                return 0;
        }
    }

    @Override // p000.AbstractC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int mo2060() {
        switch (this.f2261) {
            case 0:
                return 0;
            default:
                return this.f2262.m4494();
        }
    }
}
