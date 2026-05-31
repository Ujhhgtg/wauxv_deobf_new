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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲀᤞᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0661 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2547;

    public /* synthetic */ C0661(int i) {
        this.f2547 = i;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x02a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.app.Activity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.view.View, java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᤝᲈᲀ] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View, ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᤝᲈᲀ] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) {
        Object c2641;
        final ?? c3465;
        C3465 c3466;
        int i = this.f2547;
        int i2 = 0;
        C3554 c3554 = C3554.UNIT;
        switch (i) {
            case 0:
                String[] strArr = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ChatroomService", "[isEnableRoomManager]");
                return c3554;
            case 1:
                ((C1023) obj).f3740 = new C0661(2);
                return c3554;
            case 2:
                C1335 c1335 = (C1335) obj;
                String[] strArr2 = AbstractC1471.f5234;
                c1335.m3156("com.tencent.mm.storage");
                C2012 c2012 = new C2012();
                c2012.m4021("MicroMsg.ChatroomStorage", "[getMemberCount] cost:%sms");
                c1335.f4794 = c2012;
                return c3554;
            case 3:
                ((C1023) obj).f3739 = new C0661(4);
                return c3554;
            case 4:
                ((C1334) obj).m3153(new C0661(5));
                return c3554;
            case 5:
                String[] strArr3 = AbstractC1471.f5234;
                ((C0700) obj).m2220("MicroMsg.ChattingContext", "[notifyDataSetChange]");
                return c3554;
            case 6:
                ((C1023) obj).f3739 = new C0661(7);
                return c3554;
            case 7:
                C1334 c1334 = (C1334) obj;
                c1334.getClass();
                C0700 c0700 = new C0700();
                String[] strArr4 = AbstractC1471.f5234;
                c0700.m2220((AbstractC0972.m2596(EnumC3737.f11679) || AbstractC0972.m2597(EnumC3734.f11645)) ? "MicroMsg.ChattingDataAdapterV3" : "MicroMsg.ChattingDataAdapterV2", "[handleMsgChange] isLockNotify:");
                c1334.f4791 = c0700;
                return c3554;
            case 8:
                ((C1023) obj).f3739 = new C0661(9);
                return c3554;
            case 9:
                C1334 c1336 = (C1334) obj;
                String[] strArr5 = AbstractC1471.f5234;
                c1336.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0701 = new C0700();
                c0701.m2220("MicroMsg.ChattingUI.FootComponent", "onNotifyChange event %s talker %s");
                c1336.f4791 = c0701;
                return c3554;
            case 10:
                ((C1023) obj).f3739 = new C0661(11);
                return c3554;
            case 11:
                C1334 c1337 = (C1334) obj;
                String[] strArr6 = AbstractC1471.f5234;
                c1337.m3154("com.tencent.mm.ui.chatting.component");
                C0700 c0702 = new C0700();
                c0702.m2220("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
                c1337.f4791 = c0702;
                return c3554;
            case Opcodes.FCONST_1 /* 12 */:
                return ((C0694) obj).m2210().f3737;
            case 13:
                return Boolean.valueOf(Modifier.isPublic(((Constructor) obj).getModifiers()));
            case Opcodes.DCONST_0 /* 14 */:
                String[] strArr7 = AbstractC1471.f5234;
                View viewM4622 = AbstractC2647.m4622((View) obj, R.layout.module_dialog_clear_all_unread, null, false);
                int i3 = R.id.moduleDialogCbClearAllUnreadLeftTopMenu;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbClearAllUnreadLeftTopMenu);
                if (materialCheckBox != null) {
                    i3 = R.id.moduleDialogCbClearAllUnreadMsgDrag;
                    MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) AbstractC1272.m3098(viewM4622, R.id.moduleDialogCbClearAllUnreadMsgDrag);
                    if (materialCheckBox2 != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM4622;
                        C2046 c2046 = new C2046(linearLayout, materialCheckBox, materialCheckBox2, i2);
                        materialCheckBox2.setChecked(C0717.f2727.m2660());
                        materialCheckBox.setChecked(C0716.f2726.m2660());
                        C2037 c2037 = new C2037();
                        C0718.f2728.getClass();
                        c2037.f6779 = C0718.f2730;
                        c2037.f6781 = linearLayout;
                        c2037.m4057("保存", new C0114(c2046, 13));
                        AbstractC2844.m4788(c2037, null, 3);
                        return c3554;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM4622.getResources().getResourceName(i3)));
            case 15:
                C1574 c1574 = (C1574) obj;
                String[] strArr8 = AbstractC1471.f5234;
                c1574.getClass();
                try {
                    c2641 = c1574.m3447()[0];
                    if (c2641 == null) {
                        c2641 = null;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                Integer num = (Integer) c2641;
                if ((num != null ? num.intValue() : 0) == 0 && C0717.f2727.m2660()) {
                    int i4 = AbstractC1768.f5906;
                    C2004 c2004M3560 = AbstractC2727.m4713(c1574.m3448()).m3560();
                    c2004M3560.f6475 = "getContext";
                    ?? r0 = (Activity) ((C2013) AbstractC2844.m4776(c2004M3560)).m4026(new Object[0]);
                    Object objM3449 = c1574.m3449();
                    if (objM3449 == null) {
                        objM3449 = null;
                    }
                    C1300 c1300M3558 = AbstractC2727.m4713(objM3449).m3558();
                    c1300M3558.f4724 = AbstractC2574.m4549(TextView.class);
                    Object obj2 = null;
                    for (Object obj3 : c1300M3558.m3117()) {
                        TextView textView = (TextView) ((C1316) obj3).m3127();
                        int id = textView.getId();
                        Integer numM3307 = AbstractC1468.m3307(textView, "icon_tv");
                        if (numM3307 == null || id != numM3307.intValue()) {
                            if (i2 != 0) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            i2 = 1;
                            obj2 = obj3;
                        }
                    }
                    if (i2 == 0) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    final TextView textView2 = (TextView) ((C1316) obj2).m3127();
                    WeakReference weakReference = C3465.f10900;
                    if (weakReference == null || (c3466 = (C3465) weakReference.get()) == null) {
                        c3465 = new C3465(r0);
                        C3465.f10900 = new WeakReference(c3465);
                        c3465.setTag(r0);
                        r0.addContentView(c3465, new ViewGroup.LayoutParams(-1, -1));
                    } else {
                        c3465 = AbstractC1469.m3322(c3466.getTag(), r0) ? c3466 : 0;
                        if (c3465 == 0) {
                            c3465 = new C3465(r0);
                            C3465.f10900 = new WeakReference(c3465);
                            c3465.setTag(r0);
                            r0.addContentView(c3465, new ViewGroup.LayoutParams(-1, -1));
                        }
                    }
                    final C0112 c0112 = new C0112(20);
                    c3465.bringToFront();
                    textView2.setOnTouchListener(new View.OnTouchListener() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᤝᲀᲈ
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
                            C3465 c3467 = c3465;
                            View view2 = textView2;
                            if (action == 0) {
                                int[] iArr = new int[2];
                                view2.getLocationOnScreen(iArr);
                                int[] iArr2 = new int[2];
                                c3467.getLocationOnScreen(iArr2);
                                c3467.f10907 = (view2.getWidth() / 2) + (iArr[0] - iArr2[0]);
                                float height = (view2.getHeight() / 2) + (iArr[1] - iArr2[1]);
                                c3467.f10908 = height;
                                c3467.f10903 = c3467.f10907;
                                c3467.f10904 = height;
                                ImageView imageView = new ImageView(c3467.getContext());
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                                imageView.draw(new Canvas(bitmapCreateBitmap));
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                                imageView.setX(c3467.f10907 - (imageView.getMeasuredWidth() / 2.0f));
                                imageView.setY(c3467.f10907 - (imageView.getMeasuredHeight() / 2.0f));
                                c3467.addView(imageView);
                                imageView.measure(0, 0);
                                c3467.f10912 = imageView;
                                view2.setVisibility(4);
                                ViewParent parent = view2.getParent();
                                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(true);
                                }
                                c3467.f10911 = true;
                            } else if (action == 1 || action == 3) {
                                c3467.f10911 = false;
                                ImageView imageView2 = c3467.f10912;
                                if (imageView2 != null) {
                                    c3467.removeView(imageView2);
                                }
                                ViewParent parent2 = view2.getParent();
                                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                if (viewGroup != null) {
                                    viewGroup.requestDisallowInterceptTouchEvent(false);
                                }
                                if (c3467.f10910) {
                                    c3467.postDelayed(new RunnableC0541(c0112, 9), 400L);
                                } else {
                                    view2.setVisibility(0);
                                }
                            } else {
                                float f = 2;
                                c3467.f10905 = ((motionEvent.getRawX() - 0.0f) + c3467.f10907) / f;
                                c3467.f10906 = ((motionEvent.getRawY() - 0.0f) + c3467.f10908) / f;
                                c3467.f10903 = motionEvent.getRawX() - 0.0f;
                                c3467.f10904 = motionEvent.getRawY() - 0.0f;
                                ImageView imageView3 = c3467.f10912;
                                if (imageView3 != null) {
                                    imageView3.setX(c3467.f10903 - (imageView3.getWidth() / 2.0f));
                                    imageView3.setY(c3467.f10904 - (imageView3.getHeight() / 2.0f));
                                }
                            }
                            c3467.invalidate();
                            return true;
                        }
                    });
                }
                return c3554;
            case 16:
                C1023 c1023 = (C1023) obj;
                c1023.f3739 = new C0661(17);
                c1023.f3740 = new C0661(18);
                return c3554;
            case Opcodes.SIPUSH /* 17 */:
                C1334 c1338 = (C1334) obj;
                String[] strArr9 = AbstractC1471.f5234;
                c1338.m3154("com.tencent.mm.console");
                C0700 c0703 = new C0700();
                c0703.m2220("MicroMsg.CommandProcessor", "summer processed log level[%s], need open debug ret false");
                c1338.f4791 = c0703;
                return c3554;
            case Opcodes.LDC /* 18 */:
                C1335 c1339 = (C1335) obj;
                c1339.getClass();
                C2012 c2013 = new C2012();
                C2012.m4013(c2013);
                Class<Boolean> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Boolean.class));
                Class<String> clsM4774 = AbstractC2844.m4774(c2013, clsM4232 != null ? clsM4232 : Boolean.class, String.class);
                c2013.m4017(clsM4774 != null ? clsM4774 : String.class);
                c1339.f4794 = c2013;
                return c3554;
            case 19:
                ((C1574) obj).m3451();
                return c3554;
            case 20:
                ((C1023) obj).f3739 = new C0661(21);
                return c3554;
            case Opcodes.ILOAD /* 21 */:
                C1334 c13310 = (C1334) obj;
                String[] strArr10 = AbstractC1471.f5234;
                c13310.m3154("com.tencent.mm.storage");
                C0700 c0704 = new C0700();
                c0704.m2220("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s");
                c13310.f4791 = c0704;
                return c3554;
            case Opcodes.LLOAD /* 22 */:
                ((C1023) obj).f3740 = new C0661(23);
                return c3554;
            case Opcodes.FLOAD /* 23 */:
                ((C1335) obj).m3155(new C0661(24));
                return c3554;
            case Opcodes.DLOAD /* 24 */:
                String[] strArr11 = AbstractC1471.f5234;
                ((C2012) obj).m4021("login_weixin_username", "login_user_name", "last_login_nick_name", "last_login_bind_mobile", "last_login_bind_email", "last_login_bind_qq");
                return c3554;
            case Opcodes.ALOAD /* 25 */:
                C2015 c2015 = (C2015) obj;
                c2015.getClass();
                C2012 c2014 = new C2012();
                String[] strArr12 = AbstractC1471.f5234;
                c2014.m4020("compareContent");
                c2015.m4042(c2014);
                C2012 c2016 = new C2012();
                c2016.m4020("op");
                c2015.m4042(c2016);
                c2015.m4043(new C0661(26));
                return c3554;
            case 26:
                C2012 c2017 = (C2012) obj;
                C0661 c0661 = new C0661(27);
                c2017.getClass();
                C2015 c2018 = new C2015();
                c0661.invoke(c2018);
                c2017.f6670 = c2018;
                return c3554;
            case 27:
                C2015 c2019 = (C2015) obj;
                c2019.m4043(new C0661(28));
                c2019.m4043(new C0661(29));
                return c3554;
            case 28:
                String[] strArr13 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
                return c3554;
            default:
                String[] strArr14 = AbstractC1471.f5234;
                ((C2012) obj).m4021("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
                return c3554;
        }
    }
}
