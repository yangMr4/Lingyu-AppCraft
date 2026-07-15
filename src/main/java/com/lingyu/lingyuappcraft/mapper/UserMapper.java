package com.lingyu.lingyuappcraft.mapper;

import com.lingyu.lingyuappcraft.model.entity.App;
import com.mybatisflex.core.BaseMapper;
import com.lingyu.lingyuappcraft.model.entity.User;

/**
 * 用户 映射层。
 *
 * @author <a href="https://github.com/yangMr4">yangyunjia</a>
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 应用 映射层。
     *
     * @author <a href="https://github.com/yangMr4">yangyunjia</a>
     */
    interface AppMapper extends BaseMapper<App> {

    }
}
