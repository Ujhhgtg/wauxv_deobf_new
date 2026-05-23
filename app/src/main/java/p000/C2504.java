package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2504 {

    public int f7984;

    public int f7985;

    public int f7986;

    public int f7987;

    public int f7988;

    public boolean f7989;

    public boolean f7990;

    public boolean f7991;

    public boolean f7992;

    public boolean f7993;

    public boolean f7994;

    public int f7995;

    public long f7996;

    public int f7997;

    public final String toString() {
        return "State{mTargetPosition=" + this.f7984 + ", mData=null, mItemCount=" + this.f7988 + ", mIsMeasuring=" + this.f7992 + ", mPreviousLayoutItemCount=" + this.f7985 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7986 + ", mStructureChanged=" + this.f7989 + ", mInPreLayout=" + this.f7990 + ", mRunSimpleAnimations=" + this.f7993 + ", mRunPredictiveAnimations=" + this.f7994 + '}';
    }

    public final void m4504(int i) {
        if ((this.f7987 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f7987));
    }

    public final int m4505() {
        return this.f7990 ? this.f7985 - this.f7986 : this.f7988;
    }
}
