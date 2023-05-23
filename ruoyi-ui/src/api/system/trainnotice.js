import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listNotice(query) {
  return request({
    url: '/system/notice/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getNotice(id) {
  return request({
    url: '/system/notice/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addNotice(data) {
  return request({
    url: '/system/notice',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateNotice(data) {
  return request({
    url: '/system/notice',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delNotice(id) {
  return request({
    url: '/system/notice/' + id,
    method: 'delete'
  })
}
