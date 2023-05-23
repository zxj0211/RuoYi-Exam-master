import request from '@/utils/request'

// 查询岗位课程列表
export function listPosition_course(query) {
  return request({
    url: '/position/position_course/list',
    method: 'get',
    params: query
  })
}

// 查询岗位课程详细
export function getPosition_course(id) {
  return request({
    url: '/position/position_course/' + id,
    method: 'get'
  })
}

// 新增岗位课程
export function addPosition_course(data) {
  return request({
    url: '/position/position_course',
    method: 'post',
    data: data
  })
}

// 修改岗位课程
export function updatePosition_course(data) {
  return request({
    url: '/position/position_course',
    method: 'put',
    data: data
  })
}

// 删除岗位课程
export function delPosition_course(id) {
  return request({
    url: '/position/position_course/' + id,
    method: 'delete'
  })
}
