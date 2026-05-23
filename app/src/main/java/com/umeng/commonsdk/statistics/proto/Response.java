package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.db;
import com.umeng.analytics.pro.de;
import com.umeng.analytics.pro.dk;
import com.umeng.analytics.pro.dl;
import com.umeng.analytics.pro.dq;
import com.umeng.analytics.pro.dr;
import com.umeng.analytics.pro.dv;
import com.umeng.analytics.pro.dx;
import com.umeng.analytics.pro.dy;
import com.umeng.analytics.pro.ed;
import com.umeng.analytics.pro.ee;
import com.umeng.analytics.pro.eg;
import com.umeng.analytics.pro.ei;
import com.umeng.analytics.pro.ej;
import com.umeng.analytics.pro.el;
import com.umeng.analytics.pro.em;
import com.umeng.analytics.pro.en;
import com.umeng.analytics.pro.eo;
import com.umeng.analytics.pro.ep;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Response implements de<Response, e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<e, dq> metaDataMap;
    private static final Map<Class<? extends el>, em> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public com.umeng.commonsdk.statistics.proto.d imprint;
    public String msg;
    private e[] optionals;
    public int resp_code;
    private static final ei STRUCT_DESC = new ei("Response");
    private static final dy RESP_CODE_FIELD_DESC = new dy("resp_code", (byte) 8, 1);
    private static final dy MSG_FIELD_DESC = new dy("msg", (byte) 11, 2);
    private static final dy IMPRINT_FIELD_DESC = new dy("imprint", (byte) 12, 3);

    /* JADX INFO: compiled from: obf */
    public static class a extends en<Response> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, Response response) throws ee {
            edVar.j();
            while (true) {
                dy dyVarL = edVar.l();
                byte b = dyVarL.b;
                if (b == 0) {
                    break;
                }
                short s = dyVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            eg.a(edVar, b);
                        } else if (b == 12) {
                            com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                            response.imprint = dVar;
                            dVar.read(edVar);
                            response.setImprintIsSet(true);
                        } else {
                            eg.a(edVar, b);
                        }
                    } else if (b == 11) {
                        response.msg = edVar.z();
                        response.setMsgIsSet(true);
                    } else {
                        eg.a(edVar, b);
                    }
                } else if (b == 8) {
                    response.resp_code = edVar.w();
                    response.setResp_codeIsSet(true);
                } else {
                    eg.a(edVar, b);
                }
                edVar.m();
            }
            edVar.k();
            if (response.isSetResp_code()) {
                response.validate();
            } else {
                throw new ee("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
            }
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, Response response) throws ee {
            response.validate();
            edVar.a(Response.STRUCT_DESC);
            edVar.a(Response.RESP_CODE_FIELD_DESC);
            edVar.a(response.resp_code);
            edVar.c();
            if (response.msg != null && response.isSetMsg()) {
                edVar.a(Response.MSG_FIELD_DESC);
                edVar.a(response.msg);
                edVar.c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                edVar.a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(edVar);
                edVar.c();
            }
            edVar.d();
            edVar.b();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class b implements em {
        private b() {
        }

        @Override // com.umeng.analytics.pro.em
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class c extends eo<Response> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.el
        public void a(ed edVar, Response response) {
            ej ejVar = (ej) edVar;
            ejVar.a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            ejVar.a(bitSet, 2);
            if (response.isSetMsg()) {
                ejVar.a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(ejVar);
            }
        }

        @Override // com.umeng.analytics.pro.el
        public void b(ed edVar, Response response) {
            ej ejVar = (ej) edVar;
            response.resp_code = ejVar.w();
            response.setResp_codeIsSet(true);
            BitSet bitSetB = ejVar.b(2);
            if (bitSetB.get(0)) {
                response.msg = ejVar.z();
                response.setMsgIsSet(true);
            }
            if (bitSetB.get(1)) {
                com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                response.imprint = dVar;
                dVar.read(ejVar);
                response.setImprintIsSet(true);
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static class d implements em {
        private d() {
        }

        @Override // com.umeng.analytics.pro.em
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        schemes = map;
        map.put(en.class, new b());
        map.put(eo.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.RESP_CODE, new dq("resp_code", (byte) 1, new dr((byte) 8)));
        enumMap.put(e.MSG, new dq("msg", (byte) 2, new dr((byte) 11)));
        enumMap.put(e.IMPRINT, new dq("imprint", (byte) 2, new dv((byte) 12, com.umeng.commonsdk.statistics.proto.d.class)));
        Map<e, dq> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        dq.a(Response.class, mapUnmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new dx(new ep(objectInputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new dx(new ep(objectOutputStream)));
        } catch (dk e2) {
            throw new IOException(e2.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.de
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public com.umeng.commonsdk.statistics.proto.d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public boolean isSetResp_code() {
        return db.a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.de
    public void read(ed edVar) {
        schemes.get(edVar.D()).b().b(edVar, this);
    }

    public Response setImprint(com.umeng.commonsdk.statistics.proto.d dVar) {
        this.imprint = dVar;
        return this;
    }

    public void setImprintIsSet(boolean z) {
        if (z) {
            return;
        }
        this.imprint = null;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z) {
        if (z) {
            return;
        }
        this.msg = null;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = db.a(this.__isset_bitfield, 0, z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
            if (dVar == null) {
                sb.append("null");
            } else {
                sb.append(dVar);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = db.b(this.__isset_bitfield, 0);
    }

    public void validate() throws ee {
        com.umeng.commonsdk.statistics.proto.d dVar = this.imprint;
        if (dVar != null) {
            dVar.l();
        }
    }

    @Override // com.umeng.analytics.pro.de
    public void write(ed edVar) {
        schemes.get(edVar.D()).b().a(edVar, this);
    }

    @Override // com.umeng.analytics.pro.de
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.de
    public e fieldForId(int i) {
        return e.a(i);
    }

    /* JADX INFO: compiled from: obf */
    public enum e implements dl {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, "imprint");

        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                d.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(AbstractC1194.m2780(i, "Field ", " doesn't exist!"));
        }

        public static e a(String str) {
            return d.get(str);
        }

        @Override // com.umeng.analytics.pro.dl
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.dl
        public String b() {
            return this.f;
        }
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new e[]{e.MSG, e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new com.umeng.commonsdk.statistics.proto.d(response.imprint);
        }
    }
}
