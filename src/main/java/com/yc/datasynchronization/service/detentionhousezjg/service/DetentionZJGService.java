package com.yc.datasynchronization.service.detentionhousezjg.service;

import com.yc.datasynchronization.service.detentionhouse1.entity.*;
import com.yc.datasynchronization.service.detentionhousecs.entity.*;


import java.util.List;

public interface DetentionZJGService {
    List<SLshjxxb> getZJGLshjxxb(String hj);

    List<SRybdxxb> getZJGRsrq();

    List<SYljlb> getZJGYljib(String yl);

    List<STjcsdj> getZJGTjcsdj(String ty);

}
