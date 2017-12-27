package com.shanshui.smartcommunity.clients.feign.client.api

import org.springframework.cloud.netflix.feign.FeignClient

/**
 * Created by I336253 on 12/27/2017.
 */
@FeignClient("stores")
public interface CommunityClient {

}