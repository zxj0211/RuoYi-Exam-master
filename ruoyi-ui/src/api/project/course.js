import request from '@/utils/request'

// 查询岗位与课程关联，一对多关系列表
export function listCourse(query) {
  return request({
    url: '/project/course/list',
    method: 'get',
    params: query
  })
}

// 查询岗位与课程关联，一对多关系详细
export function getCourse(id) {
  return request({
    url: '/project/course/' + id,
    method: 'get'
  })
}

// 新增岗位与课程关联，一对多关系
export function addCourse(data) {
  return request({
    url: '/project/course',
    method: 'post',
    data: data
  })
}

// 修改岗位与课程关联，一对多关系
export function updateCourse(data) {
  return request({
    url: '/project/course',
    method: 'put',
    data: data
  })
}

// 删除岗位与课程关联，一对多关系
export function delCourse(id) {
  return request({
    url: '/project/course/' + id,
    method: 'delete'
  })
}
