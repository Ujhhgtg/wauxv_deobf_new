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
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲀᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0679 implements InterfaceC1425 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2562;

    public /* synthetic */ C0679(int i) {
        this.f2562 = i;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x03d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.View, java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤝᤞᛸ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.View, ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤝᤞᛸ] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        Object c2585;
        final ?? c3406;
        C3406 c3407;
        int i = this.f2562;
        boolean z = false;
        int i2 = 12;
        int i3 = 20;
        int i4 = 2;
        Class<String> cls = String.class;
        int i5 = 4;
        Unit unit = Unit.INSTANCE;
        switch (i) {
            case 0:
                C1332 c1332 = (C1332) obj;
                String[] strArr = AbstractC1574.f5469;
                c1332.m3051("com.tencent.mm.ui.chatting.component");
                C0705 c0705 = new C0705(4);
                c0705.m2127("MicroMsg.ChattingUI.FootComponent", "onNotifyChange event %s talker %s");
                c1332.f4791 = c0705;
                return unit;
            case 1:
                ((C1020) obj).declaringClassMatcher = new C0679(2);
                return unit;
            case 2:
                C1332 c1333 = (C1332) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c1333.m3051("com.tencent.mm.ui.chatting.component");
                C0705 c0706 = new C0705(4);
                c0706.m2127("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
                c1333.f4791 = c0706;
                return unit;
            case 3:
                return ((C0698) obj).m2115().f3730;
            case 4:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case 5:
                String[] strArr3 = AbstractC1574.f5469;
                View viewM4676 = AbstractC2668.m4676((View) obj, R.layout.module_dialog_clear_all_unread, null, false);
                int i6 = R.id.moduleDialogCbClearAllUnreadLeftTopMenu;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbClearAllUnreadLeftTopMenu);
                if (materialCheckBox != null) {
                    i6 = R.id.moduleDialogCbClearAllUnreadMsgDrag;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC3681.m5325(viewM4676, R.id.moduleDialogCbClearAllUnreadMsgDrag);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4676;
                        C2016 c2016 = new C2016(linearLayout, materialCheckBox, materialCheckBox2);
                        materialCheckBox2.setChecked(C0722.f2733.m2536());
                        materialCheckBox.setChecked(C0721.f2732.m2536());
                        C2007 c2007 = new C2007();
                        C0723.f2734.getClass();
                        c2007.f6678 = C0723.f2736;
                        c2007.f6680 = linearLayout;
                        c2007.m3870("保存", new C0106(12, c2016));
                        AbstractC2784.m4755(c2007, null, 3);
                        return unit;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4676.getResources().getResourceName(i6)));
            case 6:
                C1563 c1563 = (C1563) obj;
                String[] strArr4 = AbstractC1574.f5469;
                c1563.getClass();
                try {
                    c2585 = c1563.m3267()[0];
                    if (c2585 == null) {
                        c2585 = null;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                Integer num = (Integer) c2585;
                if ((num != null ? num.intValue() : 0) == 0 && C0722.f2733.m2536()) {
                    int i7 = 0;
                    MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(c1563.m3268()).m3492();
                    c1973M3492.name = "getContext";
                    ?? r0 = (Activity) ((C1982) AbstractC2784.m4742(c1973M3492)).invoke(new Object[0]);
                    Object objM3269 = c1563.m3269();
                    if (objM3269 == null) {
                        objM3269 = null;
                    }
                    C1299 c1299M3490 = AbstractC0968.startMethodResolution_(objM3269).m3490();
                    c1299M3490.fieldType = AbstractC2519.classToKClass(TextView.class);
                    Object obj2 = null;
                    for (Object obj3 : c1299M3490.resolve()) {
                        TextView textView = (TextView) ((C1315) obj3).m3024();
                        int id = textView.getId();
                        Integer numM2474 = AbstractC0968.m2474(textView, "icon_tv");
                        if (numM2474 == null || id != numM2474.intValue()) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj2 = obj3;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    final TextView textView2 = (TextView) ((C1315) obj2).m3024();
                    WeakReference weakReference = C3406.f10733;
                    if (weakReference == null || (c3407 = (C3406) weakReference.get()) == null) {
                        c3406 = new C3406(r0);
                        C3406.f10733 = new WeakReference(c3406);
                        c3406.setTag(r0);
                        r0.addContentView(c3406, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        c3406 = AbstractC2207.m4087(c3407.getTag(), r0) ? c3407 : 0;
                        if (c3406 == 0) {
                            c3406 = new C3406(r0);
                            C3406.f10733 = new WeakReference(c3406);
                            c3406.setTag(r0);
                            r0.addContentView(c3406, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                    final C0104 c0104 = new C0104(20);
                    c3406.bringToFront();
                    textView2.setOnTouchListener(new View.OnTouchListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤝᛸᤞ
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
                            ViewGroup viewGroup;
                            int action = motionEvent.getAction();
                            C3406 c3408 = c3406;
                            View view2 = textView2;
                            if (action == 0) {
                                int[] iArr = new int[2];
                                view2.getLocationOnScreen(iArr);
                                int[] iArr2 = new int[2];
                                c3408.getLocationOnScreen(iArr2);
                                c3408.f10740 = (view2.getWidth() / 2) + (iArr[0] - iArr2[0]);
                                float height = (view2.getHeight() / 2) + (iArr[1] - iArr2[1]);
                                c3408.f10741 = height;
                                c3408.f10736 = c3408.f10740;
                                c3408.f10737 = height;
                                ImageView imageView = new ImageView(c3408.getContext());
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                                imageView.draw(new Canvas(bitmapCreateBitmap));
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                                imageView.setX(c3408.f10740 - (imageView.getMeasuredWidth() / 2.0f));
                                imageView.setY(c3408.f10740 - (imageView.getMeasuredHeight() / 2.0f));
                                c3408.addView(imageView);
                                imageView.measure(0, 0);
                                c3408.f10745 = imageView;
                                view2.setVisibility(4);
                                ViewParent parent = view2.getParent();
                                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(true);
                                }
                                c3408.f10744 = true;
                            } else if (action == 1 || action == 3) {
                                c3408.f10744 = false;
                                ImageView imageView2 = c3408.f10745;
                                if (imageView2 != null) {
                                    c3408.removeView(imageView2);
                                }
                                ViewParent parent2 = view2.getParent();
                                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                if (viewGroup != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(false);
                                }
                                if (c3408.f10743) {
                                    c3408.postDelayed(new RunnableC0563(9, c0104), 400L);
                                } else {
                                    view2.setVisibility(0);
                                }
                            } else {
                                float f = 2;
                                c3408.f10738 = ((motionEvent.getRawX() - 0.0f) + c3408.f10740) / 2.0f;
                                c3408.f10739 = ((motionEvent.getRawY() - 0.0f) + c3408.f10741) / 2.0f;
                                c3408.f10736 = motionEvent.getRawX() - 0.0f;
                                c3408.f10737 = motionEvent.getRawY() - 0.0f;
                                ImageView imageView3 = c3408.f10745;
                                if (imageView3 != null) {
                                    imageView3.setX(c3408.f10736 - (imageView3.getWidth() / 2.0f));
                                    imageView3.setY(c3408.f10737 - (imageView3.getHeight() / 2.0f));
                                }
                            }
                            c3408.invalidate();
                            return true;
                        }
                    });
                }
                return unit;
            case 7:
                C1020 c1020 = (C1020) obj;
                c1020.declaringClassMatcher = new C0679(8);
                c1020.thisMethodMatcher = new C0679(9);
                return unit;
            case 8:
                C1332 c1334 = (C1332) obj;
                String[] strArr5 = AbstractC1574.f5469;
                c1334.m3051("com.tencent.mm.console");
                C0705 c0707 = new C0705(4);
                c0707.m2127("MicroMsg.CommandProcessor", "summer processed log level[%s], need open debug ret false");
                c1334.f4791 = c0707;
                return unit;
            case 9:
                C1333 c1335 = (C1333) obj;
                c1335.getClass();
                C1981 c1981 = new C1981(4);
                C1981.m3819(c1981);
                Class<Boolean> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Boolean.class));
                Class<String> clsM4740 = AbstractC2784.m4740(c1981, clsM2183 != null ? clsM2183 : Boolean.class, String.class);
                c1981.paramTypes(clsM4740 != null ? clsM4740 : String.class);
                c1335.f4794 = c1981;
                return unit;
            case 10:
                ((C1563) obj).setReturnTrue();
                return unit;
            case 11:
                ((C1020) obj).declaringClassMatcher = new C0679(12);
                return unit;
            case 12 /* 12 */:
                C1332 c1336 = (C1332) obj;
                String[] strArr6 = AbstractC1574.f5469;
                c1336.m3051("com.tencent.mm.storage");
                C0705 c0708 = new C0705(4);
                c0708.m2127("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s");
                c1336.f4791 = c0708;
                return unit;
            case 13:
                ((C1020) obj).thisMethodMatcher = new C0679(14);
                return unit;
            case 14 /* 14 */:
                ((C1333) obj).m3052(new C0679(15));
                return unit;
            case 15:
                String[] strArr7 = AbstractC1574.f5469;
                ((C1981) obj).m3827("login_weixin_username", "login_user_name", "last_login_nick_name", "last_login_bind_mobile", "last_login_bind_email", "last_login_bind_qq");
                return unit;
            case 16:
                C1984 c1984 = (C1984) obj;
                c1984.getClass();
                C1981 c1982 = new C1981(4);
                String[] strArr8 = AbstractC1574.f5469;
                c1982.m3826("compareContent");
                c1984.m3848(c1982);
                C1981 c1983 = new C1981(4);
                c1983.m3826("op");
                c1984.m3848(c1983);
                c1984.m3849(new C0679(17));
                return unit;
            case 17 /* 17 */:
                C1981 c1985 = (C1981) obj;
                C0679 c0679 = new C0679(18);
                c1985.getClass();
                C1984 c1986 = new C1984(4);
                c0679.invoke(c1986);
                c1985.f6565 = c1986;
                return unit;
            case 18 /* 18 */:
                C1984 c1987 = (C1984) obj;
                c1987.m3849(new C0679(19));
                c1987.m3849(new C0679(20));
                return unit;
            case 19:
                String[] strArr9 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
                return unit;
            case 20:
                String[] strArr10 = AbstractC1574.f5469;
                ((C1981) obj).m3827("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
                return unit;
            case 21 /* 21 */:
                ((C1020) obj).declaringClassMatcher = new C0679(22);
                return unit;
            case 22 /* 22 */:
                ((C1332) obj).m3050(new C0679(23));
                return unit;
            case 23 /* 23 */:
                C0705 c0709 = (C0705) obj;
                c0709.getClass();
                C1317 c1317 = new C1317(4);
                Class<String> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                if (clsM2184 == null) {
                    clsM2184 = String.class;
                }
                c1317.m3041(clsM2184);
                Class<String> clsM2185 = AbstractC0743.m2183(AbstractC2519.classToKClass(String.class));
                c1317.m3041(clsM2185 != null ? clsM2185 : String.class);
                c1317.f4764 = new C1663(2);
                c0709.f2686 = c1317;
                c0709.m2126(new C0679(16));
                return unit;
            case 24 /* 24 */:
                C1984 c1988 = (C1984) obj;
                c1988.getClass();
                C1981 c1989 = new C1981(4);
                C1981.m3819(c1989);
                c1989.m3824(C0811.f3173.m2361());
                C2328 c2328 = new C2328(4);
                c2328.f7469 = new ArrayList(C1189.f4329);
                c1989.f6561 = c2328;
                c1988.m3848(c1989);
                return unit;
            case 25 /* 25 */:
                ((C1020) obj).thisMethodMatcher = new C0679(27);
                return unit;
            case 26:
                ((C1020) obj).declaringClassMatcher = new C0679(28);
                return unit;
            case 27:
                C1333 c1337 = (C1333) obj;
                String[] strArr11 = AbstractC1574.f5469;
                c1337.m3053("com.tencent.mm.storage");
                C1981 c19810 = new C1981(4);
                c19810.m3827("MicroMsg.Label.ContactLabelStorage", "cpan[getLabelIdByStr] label id is %s");
                c1337.f4794 = c19810;
                return unit;
            case 28:
                ((C1332) obj).m3050(new C0679(29));
                return unit;
            default:
                C0705 c07010 = (C0705) obj;
                c07010.getClass();
                C1317 c1318 = new C1317(4);
                c1318.m3041(C0811.f3173.m2361());
                c07010.f2686 = c1318;
                c07010.m2126(new C0679(24));
                return unit;
        }
    }
}
