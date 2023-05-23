import request from '@/utils/request'

// 查询企业人力资源管理标准管理列表
export function listStandard(query) {
  return request({
    url: '/system/standard/list',
    method: 'get',
    params: query
  })
}

// 查询企业人力资源管理标准管理详细
export function getStandard(standardId) {
  return request({
    url: '/system/standard/' + standardId,
    method: 'get'
  })
}

// 新增企业人力资源管理标准管理
export function addStandard(data) {
  return request({
    url: '/system/standard',
    method: 'post',
    data: data
  })
}

// 修改企业人力资源管理标准管理
export function updateStandard(data) {
  return request({
    url: '/system/standard',
    method: 'put',
    data: data
  })
}

// 删除企业人力资源管理标准管理
export function delStandard(standardId) {
  return request({
    url: '/system/standard/' + standardId,
    method: 'delete'
  })
}
