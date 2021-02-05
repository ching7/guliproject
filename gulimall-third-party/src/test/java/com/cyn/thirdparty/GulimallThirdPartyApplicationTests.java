package com.cyn.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Value("${spring.cloud.alicloud.oss.endpoint:}")
    public String endpoint;

    @Value("${spring.cloud.alicloud.access-key:}")
    public String accessKeyId;

    @Value("${spring.cloud.alicloud.secret-key:}")
    public String accessKeySecret;

    @Test
    void contextLoads() {
    }

    @Test
    void uploadTest() {
// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 创建PutObjectRequest对象。
        PutObjectRequest putObjectRequest = new PutObjectRequest("gulimall-chenyn", "印章123.png", new File("/Users/chenyanan/Desktop/印章.png"));

// 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
// ObjectMetadata metadata = new ObjectMetadata();
// metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
// metadata.setObjectAcl(CannedAccessControlList.Private);
// putObjectRequest.setMetadata(metadata);

// 上传文件。
        ossClient.putObject(putObjectRequest);

// 关闭OSSClient。
        ossClient.shutdown();
    }
}
