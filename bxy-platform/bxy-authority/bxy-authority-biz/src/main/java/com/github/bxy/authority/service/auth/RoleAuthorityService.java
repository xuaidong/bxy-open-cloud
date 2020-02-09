package com.github.bxy.authority.service.auth;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.bxy.authority.dto.auth.RoleAuthoritySaveDTO;
import com.github.bxy.authority.dto.auth.UserRoleSaveDTO;
import com.github.bxy.authority.entity.auth.RoleAuthority;

/**
 * <p>
 * 业务接口
 * 角色的资源
 * </p>
 *
 * @author bxy
 * @date 2019-07-03
 */
public interface RoleAuthorityService extends IService<RoleAuthority> {

    /**
     * 给用户分配角色
     *
     * @param userRole
     * @return
     */
    boolean saveUserRole(UserRoleSaveDTO userRole);

    /**
     * 给角色重新分配 权限（资源/菜单）
     *
     * @param roleAuthoritySaveDTO
     * @return
     */
    boolean saveRoleAuthority(RoleAuthoritySaveDTO roleAuthoritySaveDTO);
}
