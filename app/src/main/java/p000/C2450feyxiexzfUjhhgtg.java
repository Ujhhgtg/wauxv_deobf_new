package p000;

import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2450feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f7930Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f7931Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f7932Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f7933Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f7934Ujhhgtgfeyxiexzf;

    public C2450feyxiexzfUjhhgtg(C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg) {
        this.f7930Ujhhgtgfeyxiexzf = 0;
        c2790feyxiexzfUjhhgtg.getClass();
        this.f7933Ujhhgtgfeyxiexzf = new ArrayList();
        this.f7931Ujhhgtgfeyxiexzf = -1;
        this.f7934Ujhhgtgfeyxiexzf = c2790feyxiexzfUjhhgtg;
    }

    public String toString() {
        switch (this.f7930Ujhhgtgfeyxiexzf) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f7931Ujhhgtgfeyxiexzf >= 0) {
                    sb.append(" #");
                    sb.append(this.f7931Ujhhgtgfeyxiexzf);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public int m3691Ujhhgtgfeyxiexzf(boolean z) {
        String str;
        C2790feyxiexzfUjhhgtg c2790feyxiexzfUjhhgtg = (C2790feyxiexzfUjhhgtg) this.f7934Ujhhgtgfeyxiexzf;
        if (this.f7932Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("commit already called");
        }
        if (C2790feyxiexzfUjhhgtg.m4072Ujhhgtgfeyxiexzf(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0260Ujhhgtgfeyxiexzf());
            ArrayList arrayList = (ArrayList) this.f7933Ujhhgtgfeyxiexzf;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7931Ujhhgtgfeyxiexzf);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7932Ujhhgtgfeyxiexzf);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C3562feyxiexzfUjhhgtg c3562feyxiexzfUjhhgtg = (C3562feyxiexzfUjhhgtg) arrayList.get(i);
                    switch (c3562feyxiexzfUjhhgtg.f11064Ujhhgtgfeyxiexzf) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c3562feyxiexzfUjhhgtg.f11064Ujhhgtgfeyxiexzf;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c3562feyxiexzfUjhhgtg.f11065Ujhhgtgfeyxiexzf);
                    if (c3562feyxiexzfUjhhgtg.f11066Ujhhgtgfeyxiexzf != 0 || c3562feyxiexzfUjhhgtg.f11067Ujhhgtgfeyxiexzf != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c3562feyxiexzfUjhhgtg.f11066Ujhhgtgfeyxiexzf));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c3562feyxiexzfUjhhgtg.f11067Ujhhgtgfeyxiexzf));
                    }
                    if (c3562feyxiexzfUjhhgtg.f11068Ujhhgtgfeyxiexzf != 0 || c3562feyxiexzfUjhhgtg.f11069Ujhhgtgfeyxiexzf != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c3562feyxiexzfUjhhgtg.f11068Ujhhgtgfeyxiexzf));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c3562feyxiexzfUjhhgtg.f11069Ujhhgtgfeyxiexzf));
                    }
                }
            }
            printWriter.close();
        }
        this.f7932Ujhhgtgfeyxiexzf = true;
        this.f7931Ujhhgtgfeyxiexzf = -1;
        if (!z) {
            c2790feyxiexzfUjhhgtg.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c2790feyxiexzfUjhhgtg.f8834Ujhhgtgfeyxiexzf)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f7931Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public void m3692Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f7930Ujhhgtgfeyxiexzf;
        Object obj = this.f7933Ujhhgtgfeyxiexzf;
        Object obj2 = this.f7934Ujhhgtgfeyxiexzf;
        switch (i2) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f684feyxiexzfUjhhgtg;
                if (weakReference != null && weakReference.get() != null) {
                    this.f7931Ujhhgtgfeyxiexzf = i;
                    if (!this.f7932Ujhhgtgfeyxiexzf) {
                        Field field = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                        ((View) bottomSheetBehavior.f684feyxiexzfUjhhgtg.get()).postOnAnimation((RunnableC3012feyxiexzfUjhhgtg) obj);
                        this.f7932Ujhhgtgfeyxiexzf = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f852Ujhhgtgfeyxiexzf;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f7931Ujhhgtgfeyxiexzf = i;
                    if (!this.f7932Ujhhgtgfeyxiexzf) {
                        Field field2 = AbstractC1901feyxiexzfUjhhgtg.f6355Ujhhgtgfeyxiexzf;
                        ((View) sideSheetBehavior.f852Ujhhgtgfeyxiexzf.get()).postOnAnimation((RunnableC2779feyxiexzfUjhhgtg) obj);
                        this.f7932Ujhhgtgfeyxiexzf = true;
                    }
                    break;
                }
                break;
        }
    }

    public C2450feyxiexzfUjhhgtg(SideSheetBehavior sideSheetBehavior) {
        this.f7930Ujhhgtgfeyxiexzf = 2;
        this.f7934Ujhhgtgfeyxiexzf = sideSheetBehavior;
        this.f7933Ujhhgtgfeyxiexzf = new RunnableC2779feyxiexzfUjhhgtg(6, this);
    }

    public C2450feyxiexzfUjhhgtg(BottomSheetBehavior bottomSheetBehavior) {
        this.f7930Ujhhgtgfeyxiexzf = 1;
        this.f7934Ujhhgtgfeyxiexzf = bottomSheetBehavior;
        this.f7933Ujhhgtgfeyxiexzf = new RunnableC3012feyxiexzfUjhhgtg(3, this);
    }
}
