import request from '@/utils/request'

// 查询题库管理列表
export function listBanks(query) {
  return request({
    url: '/system/banks/list',
    method: 'get',
    params: query
  })
}

// 查询题库管理详细
export function getBanks(id) {
  return request({
    url: '/system/banks/' + id,
    method: 'get'
  })
}

// 新增题库管理
export function addBanks(data) {
  return request({
    url: '/system/banks',
    method: 'post',
    data: data
  })
}

// 修改题库管理
export function updateBanks(data) {
  return request({
    url: '/system/banks',
    method: 'put',
    data: data
  })
}

// 删除题库管理
export function delBanks(id) {
  return request({
    url: '/system/banks/' + id,
    method: 'delete'
  })
}
