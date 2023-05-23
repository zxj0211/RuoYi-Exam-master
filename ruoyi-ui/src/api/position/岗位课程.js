import request from '@/utils/request'

// 查询position_course列表
export function list岗位课程(query) {
  return request({
    url: '/position/岗位课程/list',
    method: 'get',
    params: query
  })
}

// 查询position_course详细
export function get岗位课程(id) {
  return request({
    url: '/position/岗位课程/' + id,
    method: 'get'
  })
}

// 新增position_course
export function add岗位课程(data) {
  return request({
    url: '/position/岗位课程',
    method: 'post',
    data: data
  })
}

// 修改position_course
export function update岗位课程(data) {
  return request({
    url: '/position/岗位课程',
    method: 'put',
    data: data
  })
}

// 删除position_course
export function del岗位课程(id) {
  return request({
    url: '/position/岗位课程/' + id,
    method: 'delete'
  })
}
