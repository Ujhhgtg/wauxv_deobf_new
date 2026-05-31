package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterMisc implements ObjectWriter {
    static final ObjectWriterMisc INSTANCE = new ObjectWriterMisc();

    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String strPattern;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.util.regex.Pattern")) {
            strPattern = ((Pattern) obj).pattern();
        } else {
            if (name.equals("net.sf.json.JSONNull")) {
                jSONWriter.writeNull();
                return;
            }
            if (name.equals("java.net.Inet6Address")) {
                strPattern = ((InetAddress) obj).getHostName();
            } else {
                if (name.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                    String string = obj.toString();
                    if (jSONWriter.isUTF8()) {
                        jSONWriter.writeRaw(string.getBytes(StandardCharsets.UTF_8));
                        return;
                    } else {
                        jSONWriter.writeRaw(string);
                        return;
                    }
                }
                if (name.equals("java.net.Inet4Address")) {
                    strPattern = ((InetAddress) obj).getHostName();
                } else {
                    if (!name.equals("java.text.SimpleDateFormat")) {
                        if (!name.equals("java.net.InetSocketAddress")) {
                            throw new JSONException("not support class : ".concat(name));
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                        jSONWriter.startObject();
                        jSONWriter.writeName("address");
                        jSONWriter.writeColon();
                        jSONWriter.writeAny(inetSocketAddress.getAddress());
                        jSONWriter.writeName("port");
                        jSONWriter.writeColon();
                        jSONWriter.writeInt32(inetSocketAddress.getPort());
                        jSONWriter.endObject();
                        return;
                    }
                    strPattern = ((SimpleDateFormat) obj).toPattern();
                }
            }
        }
        jSONWriter.writeString(strPattern);
    }
}
