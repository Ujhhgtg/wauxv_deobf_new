package p000;

import android.util.Log;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᤞᲈᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0337 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public int f1653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f1654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f1655;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object f1656;

    public C0337(C0552 c0552) {
        this.f1652 = 0;
        c0552.getClass();
        this.f1655 = new ArrayList();
        this.f1653 = -1;
        this.f1656 = c0552;
    }

    public String toString() {
        switch (this.f1652) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.f1653 >= 0) {
                    sb.append(" #");
                    sb.append(this.f1653);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public int m1578(boolean z) {
        String str;
        C0552 c0552 = (C0552) this.f1656;
        if (this.f1654) {
            throw new IllegalStateException("commit already called");
        }
        if (C0552.m2079(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1880());
            ArrayList arrayList = (ArrayList) this.f1655;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1653);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1654);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1419 c1419 = (C1419) arrayList.get(i);
                    switch (c1419.f5108) {
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
                            str = "cmd=" + c1419.f5108;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c1419.f5109);
                    if (c1419.f5110 != 0 || c1419.f5111 != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c1419.f5110));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c1419.f5111));
                    }
                    if (c1419.f5112 != 0 || c1419.f5113 != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c1419.f5112));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c1419.f5113));
                    }
                }
            }
            printWriter.close();
        }
        this.f1654 = true;
        this.f1653 = -1;
        if (!z) {
            c0552.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (((ArrayList) c0552.f2305)) {
            try {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1653;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public void m1579(int i) {
        int i2 = this.f1652;
        Object obj = this.f1655;
        Object obj2 = this.f1656;
        switch (i2) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.f670;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1653 = i;
                    if (!this.f1654) {
                        Field field = AbstractC3638.f11333;
                        ((View) bottomSheetBehavior.f670.get()).postOnAnimation((RunnableC0149) obj);
                        this.f1654 = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.f838;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1653 = i;
                    if (!this.f1654) {
                        Field field2 = AbstractC3638.f11333;
                        ((View) sideSheetBehavior.f838.get()).postOnAnimation((RunnableC0541) obj);
                        this.f1654 = true;
                    }
                    break;
                }
                break;
        }
    }

    public C0337(SideSheetBehavior sideSheetBehavior) {
        this.f1652 = 2;
        this.f1656 = sideSheetBehavior;
        this.f1655 = new RunnableC0541(this, 6);
    }

    public C0337(BottomSheetBehavior bottomSheetBehavior) {
        this.f1652 = 1;
        this.f1656 = bottomSheetBehavior;
        this.f1655 = new RunnableC0149(this, 3);
    }
}
