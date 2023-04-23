package io.github.ropereralk.syng.productservice.util;

import io.github.ropereralk.syng.productservice.exception.SanitizerException;
import io.micrometer.common.util.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

public final class Sanitizer {

    public static String sanitize(String dirtyInput) throws SanitizerException {

        if (StringUtils.isNotBlank(dirtyInput)){
            return Jsoup.clean(dirtyInput, Safelist.simpleText());
        }
        throw new SanitizerException("Input Sanitization Failed");
    }
}
