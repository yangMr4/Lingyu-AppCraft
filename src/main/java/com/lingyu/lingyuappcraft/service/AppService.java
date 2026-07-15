package com.lingyu.lingyuappcraft.service;

import com.lingyu.lingyuappcraft.model.dto.app.AppQueryRequest;
import com.lingyu.lingyuappcraft.model.entity.User;
import com.lingyu.lingyuappcraft.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.lingyu.lingyuappcraft.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/yangMr4">yangyunjia</a>
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    List<AppVO> getAppVOList(List<App> appList);

    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);
}

