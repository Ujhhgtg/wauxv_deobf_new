package p000;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0438 extends AbstractC0378 {

    public RequestBody f2000;

    public MultipartBody.Builder f2001;

    public FormBody.Builder f2002;

    public MediaType f2003;

    public int f2004;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r1v1, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r1v6, types: [okhttp3.FormBody] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [okhttp3.Request$Builder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.AbstractC0378
    public final Request mo1520() {
        MultipartBody.Builder builder = this.f2001;
        ?? Build = this.f2000;
        if (Build == 0) {
            Build = this.f2002.build();
            try {
                builder.build();
                int size = Build.size();
                for (int i = 0; i < size; i++) {
                    builder.addFormDataPart(Build.name(i), Build.value(i));
                }
                Build = builder.setType(this.f2003).build();
            } catch (IllegalStateException unused) {
            }
        }
        Request.Builder builderUrl = this.f1764.method(AbstractC1194.m2793(this.f2004), Build).url(this.f1761.build());
        builderUrl.tag(C2141.class, this.f1762);
        return builderUrl.build();
    }
}
