import request from '@/utils/request'

// 查询项目清单列表
export function listProject(query) {
  return request({
    url: '/system/project/list',
    method: 'get',
    params: query
  })
}

// 查询项目清单详细
export function getProject(id) {
  return request({
    url: '/system/project/' + id,
    method: 'get'
  })
}

// 新增项目清单
export function addProject(data) {
  return request({
    url: '/system/project',
    method: 'post',
    data: data
  })
}

// 修改项目清单
export function updateProject(data) {
  return request({
    url: '/system/project',
    method: 'put',
    data: data
  })
}

// 删除项目清单
export function delProject(id) {
  return request({
    url: '/system/project/' + id,
    method: 'delete'
  })
}
