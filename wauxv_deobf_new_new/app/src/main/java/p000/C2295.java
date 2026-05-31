package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriterCreatorASM;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤞᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2295 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7462;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f7463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ long f7464;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f7465;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterProvider f7466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Class f7467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7468;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f7469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterCreator f7470;

    public /* synthetic */ C2295(ObjectWriterCreator objectWriterCreator, FieldInfo fieldInfo, long j, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, boolean z, LinkedHashMap linkedHashMap, int i) {
        this.f7462 = i;
        this.f7470 = objectWriterCreator;
        this.f7463 = fieldInfo;
        this.f7464 = j;
        this.f7465 = beanInfo;
        this.f7466 = objectWriterProvider;
        this.f7467 = cls;
        this.f7468 = z;
        this.f7469 = linkedHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7462) {
            case 0:
                this.f7470.lambda$createObjectWriter$2(this.f7463, this.f7464, this.f7465, this.f7466, this.f7467, this.f7468, this.f7469, (Method) obj);
                break;
            default:
                ((ObjectWriterCreatorASM) this.f7470).lambda$createObjectWriter$1(this.f7463, this.f7464, this.f7465, this.f7466, this.f7467, this.f7468, this.f7469, (Method) obj);
                break;
        }
    }
}
