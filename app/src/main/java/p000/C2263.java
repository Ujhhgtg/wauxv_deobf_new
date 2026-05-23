package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriterCreatorASM;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2263 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f7342;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ long f7343;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f7344;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterProvider f7345;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Class f7346;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7347;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f7348;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterCreator f7349;

    public /* synthetic */ C2263(ObjectWriterCreator objectWriterCreator, FieldInfo fieldInfo, long j, BeanInfo beanInfo, ObjectWriterProvider objectWriterProvider, Class cls, boolean z, LinkedHashMap linkedHashMap, int i) {
        this.f7341 = i;
        this.f7349 = objectWriterCreator;
        this.f7342 = fieldInfo;
        this.f7343 = j;
        this.f7344 = beanInfo;
        this.f7345 = objectWriterProvider;
        this.f7346 = cls;
        this.f7347 = z;
        this.f7348 = linkedHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7341) {
            case 0:
                this.f7349.lambda$createObjectWriter$2(this.f7342, this.f7343, this.f7344, this.f7345, this.f7346, this.f7347, this.f7348, (Method) obj);
                break;
            default:
                ((ObjectWriterCreatorASM) this.f7349).lambda$createObjectWriter$1(this.f7342, this.f7343, this.f7344, this.f7345, this.f7346, this.f7347, this.f7348, (Method) obj);
                break;
        }
    }
}
