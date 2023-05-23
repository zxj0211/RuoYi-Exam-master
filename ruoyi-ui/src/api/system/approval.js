import request from '@/utils/request'

// 查询项目审批列表
export function listApproval(query) {
  return request({
    url: '/system/approval/list',
    method: 'get',
    params: query
  })
}

// 查询项目审批详细
export function getApproval(id) {
  return request({
    url: '/system/approval/' + id,
    method: 'get'
  })
}

// 新增项目审批
export function addApproval(data) {
  return request({
    url: '/system/approval',
    method: 'post',
    data: data
  })
}

// 修改项目审批
export function updateApproval(data) {
  return request({
    url: '/system/approval',
    method: 'put',
    data: data
  })
}

// 删除项目审批
export function delApproval(id) {
  return request({
    url: '/system/approval/' + id,
    method: 'delete'
  })
}
