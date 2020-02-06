package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;
import java.util.Collections;

public class Binary10_40 {

    public static org.hl7.fhir.dstu2.model.Binary convertBinary(org.hl7.fhir.r4.model.Binary src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Binary tgt = new org.hl7.fhir.dstu2.model.Binary();
        VersionConvertor_10_40.copyResource(src, tgt);
        if (src.hasContentTypeElement())
            tgt.setContentTypeElement((org.hl7.fhir.dstu2.model.CodeType) VersionConvertor_10_40.convertType(src.getContentTypeElement()));
        tgt.setContent(src.getContent());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Binary convertBinary(org.hl7.fhir.dstu2.model.Binary src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Binary tgt = new org.hl7.fhir.r4.model.Binary();
        VersionConvertor_10_40.copyResource(src, tgt);
        if (src.hasContentTypeElement())
            tgt.setContentTypeElement((org.hl7.fhir.r4.model.CodeType) VersionConvertor_10_40.convertType(src.getContentTypeElement()));
        if (src.hasContent()) {
            tgt.setContent(src.getContent());
        }
        return tgt;
    }
}
