package net.ufrog.aries.sample.client.fallbacks;

import net.ufrog.aries.common.contract.ClientFallbackFactory;
import net.ufrog.aries.sample.client.SampleClient;
import net.ufrog.aries.sample.client.contract.ResultCode;
import net.ufrog.aries.sample.client.contract.SampleResp;
import org.springframework.stereotype.Component;

@Component
public class SampleClientFallbackFactory extends ClientFallbackFactory<SampleClient> {

    @Override
    public SampleClient getClientFallback() {
        return id -> {
            SampleResp sampleResp = new SampleResp();
            sampleResp.setCode("failure");
            sampleResp.setName("失败");
            sampleResp.setResultCode(ResultCode.UNKNOW);
            return sampleResp;
        };
    }
}
