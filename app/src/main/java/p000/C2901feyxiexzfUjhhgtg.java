package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴ要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2901feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9180Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2901feyxiexzfUjhhgtg(int i) {
        this.f9180Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x02be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v19, types: [android.view.View, java.lang.Object, 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能要点脸ᛴ] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View, 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能要点脸ᛴ] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        final ?? c1725Ujhhgtgfeyxiexzf;
        C1725Ujhhgtgfeyxiexzf c1725Ujhhgtgfeyxiexzf2;
        int i = this.f9180Ujhhgtgfeyxiexzf;
        int i2 = 3;
        int i3 = 19;
        int i4 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928493955915449738L, strArr));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928494866448516490L, strArr), MagicFactory.get(4928493934440613258L, strArr));
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(2);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C2901feyxiexzfUjhhgtg(i2));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928214757271405962L, strArr2), MagicFactory.get(4928214924775130506L, strArr2));
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(5);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.getClass();
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf((AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7373Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7351Ujhhgtgfeyxiexzf)) ? MagicFactory.get(4928215809538393482L, strArr3) : MagicFactory.get(4928215951272314250L, strArr3), MagicFactory.get(4928216093006235018L, strArr3));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928219928412030346L, strArr4));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928219670713992586L, strArr4), MagicFactory.get(4928219799563011466L, strArr4));
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(9);
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg3 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg3.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928218433763411338L, strArr5));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf3 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf3.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928219060828636554L, strArr5), MagicFactory.get(4928219314231707018L, strArr5));
                c3456feyxiexzfUjhhgtg3.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                return ((C2803Ujhhgtgfeyxiexzf) obj).m4124Ujhhgtgfeyxiexzf().f10253Ujhhgtgfeyxiexzf;
            case 11:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case Opcodes.FCONST_1 /* 12 */:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_clear_all_unread, null, false);
                int i5 = R.id.moduleDialogCbClearAllUnreadLeftTopMenu;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbClearAllUnreadLeftTopMenu);
                if (materialCheckBox != null) {
                    i5 = R.id.moduleDialogCbClearAllUnreadMsgDrag;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogCbClearAllUnreadMsgDrag);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                        C0326Ujhhgtgfeyxiexzf c0326Ujhhgtgfeyxiexzf = new C0326Ujhhgtgfeyxiexzf(linearLayout, materialCheckBox, materialCheckBox2, i4);
                        materialCheckBox2.setChecked(C2827feyxiexzfUjhhgtg.f8988Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        materialCheckBox.setChecked(C2828feyxiexzfUjhhgtg.f8989Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf());
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        C2830feyxiexzfUjhhgtg.f8992Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2830feyxiexzfUjhhgtg.f8994Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928846461061301642L, strArr6), new C2977Ujhhgtgfeyxiexzf(13, c0326Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928819097824658826L, strArr6).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i5)));
            case 13:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Integer num = (Integer) c0919feyxiexzfUjhhgtg;
                if ((num != null ? num.intValue() : 0) == 0 && C2827feyxiexzfUjhhgtg.f8988Ujhhgtgfeyxiexzf.m4617Ujhhgtgfeyxiexzf()) {
                    int i6 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0578Ujhhgtgfeyxiexzf.m1849Ujhhgtgfeyxiexzf()).m2024Ujhhgtgfeyxiexzf();
                    c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = MagicFactory.get(4928846448176399754L, strArr7);
                    ?? r0 = (Activity) ((C0393Ujhhgtgfeyxiexzf) AbstractC1225feyxiexzfUjhhgtg.m2697Ujhhgtgfeyxiexzf(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf)).m1650Ujhhgtgfeyxiexzf(new Object[0]);
                    Object objM1850Ujhhgtgfeyxiexzf = c0578Ujhhgtgfeyxiexzf.m1850Ujhhgtgfeyxiexzf();
                    if (objM1850Ujhhgtgfeyxiexzf == null) {
                        objM1850Ujhhgtgfeyxiexzf = null;
                    }
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1850Ujhhgtgfeyxiexzf).m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(TextView.class);
                    Object obj2 = null;
                    for (Object obj3 : c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf()) {
                        TextView textView = (TextView) ((C3438feyxiexzfUjhhgtg) obj3).m4939Ujhhgtgfeyxiexzf();
                        int id = textView.getId();
                        Integer numM2751Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2751Ujhhgtgfeyxiexzf(textView, MagicFactory.get(4928846400931759498L, strArr7));
                        if (numM2751Ujhhgtgfeyxiexzf == null || id != numM2751Ujhhgtgfeyxiexzf.intValue()) {
                            if (i4 != 0) {
                                throw new IllegalArgumentException(MagicFactory.get(4928846504010974602L, strArr7));
                            }
                            i4 = 1;
                            obj2 = obj3;
                        }
                    }
                    if (i4 == 0) {
                        throw new NoSuchElementException(MagicFactory.get(4928846692989535626L, strArr7));
                    }
                    final TextView textView2 = (TextView) ((C3438feyxiexzfUjhhgtg) obj2).m4939Ujhhgtgfeyxiexzf();
                    WeakReference weakReference = C1725Ujhhgtgfeyxiexzf.f5782Ujhhgtgfeyxiexzf;
                    if (weakReference == null || (c1725Ujhhgtgfeyxiexzf2 = (C1725Ujhhgtgfeyxiexzf) weakReference.get()) == null) {
                        c1725Ujhhgtgfeyxiexzf = new C1725Ujhhgtgfeyxiexzf(r0);
                        C1725Ujhhgtgfeyxiexzf.f5782Ujhhgtgfeyxiexzf = new WeakReference(c1725Ujhhgtgfeyxiexzf);
                        c1725Ujhhgtgfeyxiexzf.setTag(r0);
                        r0.addContentView(c1725Ujhhgtgfeyxiexzf, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        c1725Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c1725Ujhhgtgfeyxiexzf2.getTag(), r0) ? c1725Ujhhgtgfeyxiexzf2 : 0;
                        if (c1725Ujhhgtgfeyxiexzf == 0) {
                            c1725Ujhhgtgfeyxiexzf = new C1725Ujhhgtgfeyxiexzf(r0);
                            C1725Ujhhgtgfeyxiexzf.f5782Ujhhgtgfeyxiexzf = new WeakReference(c1725Ujhhgtgfeyxiexzf);
                            c1725Ujhhgtgfeyxiexzf.setTag(r0);
                            r0.addContentView(c1725Ujhhgtgfeyxiexzf, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                    final C2975feyxiexzfUjhhgtg c2975feyxiexzfUjhhgtg = new C2975feyxiexzfUjhhgtg(i3);
                    c1725Ujhhgtgfeyxiexzf.bringToFront();
                    textView2.setOnTouchListener(new View.OnTouchListener() { // from class: 上海高中ᛱ谢子非ᛱᛲᛳᛱUjhhgtgᛱ要点脸ᛴᛱfeyxiexzfᛱ能不能
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            C1725Ujhhgtgfeyxiexzf c1725Ujhhgtgfeyxiexzf3 = c1725Ujhhgtgfeyxiexzf;
                            View view2 = textView2;
                            if (action == 0) {
                                int[] iArr = new int[2];
                                view2.getLocationOnScreen(iArr);
                                int[] iArr2 = new int[2];
                                c1725Ujhhgtgfeyxiexzf3.getLocationOnScreen(iArr2);
                                c1725Ujhhgtgfeyxiexzf3.f5789Ujhhgtgfeyxiexzf = (view2.getWidth() / 2) + (iArr[0] - iArr2[0]);
                                float height = (view2.getHeight() / 2) + (iArr[1] - iArr2[1]);
                                c1725Ujhhgtgfeyxiexzf3.f5790Ujhhgtgfeyxiexzf = height;
                                c1725Ujhhgtgfeyxiexzf3.f5785Ujhhgtgfeyxiexzf = c1725Ujhhgtgfeyxiexzf3.f5789Ujhhgtgfeyxiexzf;
                                c1725Ujhhgtgfeyxiexzf3.f5786Ujhhgtgfeyxiexzf = height;
                                ImageView imageView = new ImageView(c1725Ujhhgtgfeyxiexzf3.getContext());
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                                imageView.draw(new Canvas(bitmapCreateBitmap));
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                                imageView.setX(c1725Ujhhgtgfeyxiexzf3.f5789Ujhhgtgfeyxiexzf - (imageView.getMeasuredWidth() / 2.0f));
                                imageView.setY(c1725Ujhhgtgfeyxiexzf3.f5789Ujhhgtgfeyxiexzf - (imageView.getMeasuredHeight() / 2.0f));
                                c1725Ujhhgtgfeyxiexzf3.addView(imageView);
                                imageView.measure(0, 0);
                                c1725Ujhhgtgfeyxiexzf3.f5794Ujhhgtgfeyxiexzf = imageView;
                                view2.setVisibility(4);
                                ViewParent parent = view2.getParent();
                                ViewGroup viewGroup = (ViewGroup) (parent instanceof ViewGroup ? parent : null);
                                if (viewGroup != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(true);
                                }
                                c1725Ujhhgtgfeyxiexzf3.f5793Ujhhgtgfeyxiexzf = true;
                            } else if (action == 1 || action == 3) {
                                c1725Ujhhgtgfeyxiexzf3.f5793Ujhhgtgfeyxiexzf = false;
                                ImageView imageView2 = c1725Ujhhgtgfeyxiexzf3.f5794Ujhhgtgfeyxiexzf;
                                if (imageView2 != null) {
                                    c1725Ujhhgtgfeyxiexzf3.removeView(imageView2);
                                }
                                ViewParent parent2 = view2.getParent();
                                ViewGroup viewGroup2 = (ViewGroup) (parent2 instanceof ViewGroup ? parent2 : null);
                                if (viewGroup2 != null) {
                                    viewGroup2.requestDisallowInterceptTouchEvent(false);
                                }
                                if (c1725Ujhhgtgfeyxiexzf3.f5792Ujhhgtgfeyxiexzf) {
                                    c1725Ujhhgtgfeyxiexzf3.postDelayed(new RunnableC2779feyxiexzfUjhhgtg(9, c2975feyxiexzfUjhhgtg), 400L);
                                } else {
                                    view2.setVisibility(0);
                                }
                            } else {
                                float f = 2;
                                c1725Ujhhgtgfeyxiexzf3.f5787Ujhhgtgfeyxiexzf = ((motionEvent.getRawX() - 0.0f) + c1725Ujhhgtgfeyxiexzf3.f5789Ujhhgtgfeyxiexzf) / f;
                                c1725Ujhhgtgfeyxiexzf3.f5788Ujhhgtgfeyxiexzf = ((motionEvent.getRawY() - 0.0f) + c1725Ujhhgtgfeyxiexzf3.f5790Ujhhgtgfeyxiexzf) / f;
                                c1725Ujhhgtgfeyxiexzf3.f5785Ujhhgtgfeyxiexzf = motionEvent.getRawX() - 0.0f;
                                c1725Ujhhgtgfeyxiexzf3.f5786Ujhhgtgfeyxiexzf = motionEvent.getRawY() - 0.0f;
                                ImageView imageView3 = c1725Ujhhgtgfeyxiexzf3.f5794Ujhhgtgfeyxiexzf;
                                if (imageView3 != null) {
                                    imageView3.setX(c1725Ujhhgtgfeyxiexzf3.f5785Ujhhgtgfeyxiexzf - (imageView3.getWidth() / 2.0f));
                                    imageView3.setY(c1725Ujhhgtgfeyxiexzf3.f5786Ujhhgtgfeyxiexzf - (imageView3.getHeight() / 2.0f));
                                }
                            }
                            c1725Ujhhgtgfeyxiexzf3.invalidate();
                            return true;
                        }
                    });
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(15);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(16);
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg4 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg4.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928815683325658506L, strArr8));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf4 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf4.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928812058373260682L, strArr8), MagicFactory.get(4928815520116901258L, strArr8));
                c3456feyxiexzfUjhhgtg4.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                c3452feyxiexzfUjhhgtg2.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                C0394Ujhhgtgfeyxiexzf.m1653Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2);
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf2, clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Boolean.class, String.class);
                c0394Ujhhgtgfeyxiexzf2.m1657Ujhhgtgfeyxiexzf(clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : String.class);
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1852Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(i3);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg5 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg5.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928493328850224522L, strArr9));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf5 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf5.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928494265153095050L, strArr9), MagicFactory.get(4928494303807800714L, strArr9));
                c3456feyxiexzfUjhhgtg5.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(21);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C2901feyxiexzfUjhhgtg(22));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928262938214532490L, strArr10), MagicFactory.get(4928262981164205450L, strArr10), MagicFactory.get(4928263049883682186L, strArr10), MagicFactory.get(4928263234567275914L, strArr10), MagicFactory.get(4928263273221981578L, strArr10), MagicFactory.get(4928263316171654538L, strArr10));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf = (C0300Ujhhgtgfeyxiexzf) obj;
                c0300Ujhhgtgfeyxiexzf.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0394Ujhhgtgfeyxiexzf3.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928221968521495946L, strArr11));
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf3);
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf4 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf4.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928222041535939978L, strArr11));
                c0300Ujhhgtgfeyxiexzf.m1528Ujhhgtgfeyxiexzf(c0394Ujhhgtgfeyxiexzf4);
                c0300Ujhhgtgfeyxiexzf.m1529Ujhhgtgfeyxiexzf(new C2901feyxiexzfUjhhgtg(24));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf5 = (C0394Ujhhgtgfeyxiexzf) obj;
                C2901feyxiexzfUjhhgtg c2901feyxiexzfUjhhgtg = new C2901feyxiexzfUjhhgtg(25);
                c0394Ujhhgtgfeyxiexzf5.getClass();
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf2 = new C0300Ujhhgtgfeyxiexzf();
                c2901feyxiexzfUjhhgtg.invoke(c0300Ujhhgtgfeyxiexzf2);
                c0394Ujhhgtgfeyxiexzf5.f2141Ujhhgtgfeyxiexzf = c0300Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0300Ujhhgtgfeyxiexzf c0300Ujhhgtgfeyxiexzf3 = (C0300Ujhhgtgfeyxiexzf) obj;
                c0300Ujhhgtgfeyxiexzf3.m1529Ujhhgtgfeyxiexzf(new C2901feyxiexzfUjhhgtg(26));
                c0300Ujhhgtgfeyxiexzf3.m1529Ujhhgtgfeyxiexzf(new C2901feyxiexzfUjhhgtg(27));
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928218188950275466L, strArr12), MagicFactory.get(4928218334979163530L, strArr12));
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928221693643589002L, strArr13), MagicFactory.get(4928221938456724874L, strArr13));
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C2901feyxiexzfUjhhgtg(29);
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3664feyxiexzfUjhhgtg(i4));
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
