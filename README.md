# wauxv_deobf_new

[新版本](https://github.com/HdShare/WAuxiliary_Public/releases/tag/1356-1.2.7.r1356.3e63484)的反混淆, 微调了一些 jadx 参数, 优化了字符串解密脚本

我尚未且不打算 (我懒) 把[旧版](https://github.com/Ujhhgtg/wauxv_deobf)的类名和方法名映射迁移过来, 没什么意义, 混淆代码看多了自然就知道是啥意思, 实在不行两边对照着看也行

## 使用的 jadx 参数

```bash
jadx \
    --deobf \
    --deobf-min 1 \
    --deobf-max 65535 \
    --rename-flags "all" \
    --use-source-name-as-class-name-alias "always" \
    --show-bad-code \
    -e \
    ./wauxv_deobf_new.apk
```

## 使用的字符串解密脚本

[here](./app/src/main/decrypt_encrypted_strings.py)

(我直接把以前旧版的 Java 混淆过的解密代码丢给 Gemini 花 3 分钟跑出来的)

## p.s.

我始终不认为开源项目抄闭源项目是不道德的行为, 事实上开源项目逆向闭源项目并重新实现是非常常见的做法, 没有必要急成这样
当然我对被挂出来这件事是完全不在意的, 如果真有孝子想私信骂我那我只会把你当成乐子
