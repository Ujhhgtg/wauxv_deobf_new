package p000;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0566 extends AbstractC0567 {

    public final /* synthetic */ int f2298;

    public final /* synthetic */ CarouselLayoutManager f2299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0566(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.f2298 = i;
        switch (i) {
            case 1:
                this.f2299 = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f2299 = carouselLayoutManager;
                break;
        }
    }

    @Override // p000.AbstractC0567
    public final int mo1960() {
        switch (this.f2298) {
            case 0:
                return this.f2299.f7955;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2299;
                return carouselLayoutManager.f7955 - carouselLayoutManager.m4469();
        }
    }

    @Override // p000.AbstractC0567
    public final int mo1961() {
        switch (this.f2298) {
            case 0:
                return this.f2299.m4470();
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC0567
    public final int mo1962() {
        switch (this.f2298) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f2299;
                return carouselLayoutManager.f7954 - carouselLayoutManager.m4471();
            default:
                return this.f2299.f7954;
        }
    }

    @Override // p000.AbstractC0567
    public final int mo1963() {
        switch (this.f2298) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2299;
                if (carouselLayoutManager.m669()) {
                    return carouselLayoutManager.f7954;
                }
                return 0;
        }
    }

    @Override // p000.AbstractC0567
    public final int mo1964() {
        switch (this.f2298) {
            case 0:
                return 0;
            default:
                return this.f2299.m4472();
        }
    }
}
